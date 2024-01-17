package intervivew;

import java.util.Scanner;

public class Chocolates {

    public static int maximizePoints(int[] chocolates, int initialChocolates) {
        int points = 1;
        int currentChocolates = initialChocolates;

        for (int bagChocolates : chocolates) {
            if (bagChocolates <= currentChocolates) {
                currentChocolates -= bagChocolates;
                points++;
            } else {
                break;
            }
        }

        return points;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String[] chocolatesStr = scanner.nextLine().split(" ");
        int[] chocolates = new int[chocolatesStr.length];
        for (int i = 0; i < chocolatesStr.length; i++) {
            chocolates[i] = Integer.parseInt(chocolatesStr[i]);
        }

        int initialChocolates = Integer.parseInt(scanner.nextLine());

        // Output
        int result = maximizePoints(chocolates, initialChocolates);
        System.out.println(result);
    }

    public static class ATM{
        Scanner sc= new Scanner(System.in);
       public String statment;
        int accountbalance=10000;
        synchronized public void withdraw(int amount){

            if (amount>accountbalance){
                System.out.println("insuffient fund" );
                System.out.println("if u need  i will give some credit limit  if u want to use ,just enter yes or no ");
                statment=sc.next();




                try{
                    wait();
                }
                catch (InterruptedException e){
                    System.out.println("thank you for waiting ");
                }
                accountbalance=accountbalance-amount;

            }
            else{
                System.out.println("trastion is completed");
            }
        }

        synchronized public void deposit(int entredMoney){
            System.out.println("we are depositing here");
            accountbalance=accountbalance+entredMoney;
            notify();
            System.out.println("deposite completed");
        }

        public static void main(String[] args) {
           ATM a=new ATM();
            Thread t1=new Thread(){
                @Override
                public void run() {
                    a.withdraw(20000);
                }
            };
            t1.start();
            Thread t2=new Thread(){
                @Override
                public void run() {
                    a.deposit(30000);
                }

            };
            if (a.statment=="yes"){
                t2.start();

            }





        }
    }
}
