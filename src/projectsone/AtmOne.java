//package programs;
//
//import intervivew.Chocolates.ATM;
//
//import java.util.Scanner;
//
//public class atm {
//    package multiThreading;
//
//import java.util.Scanner;
//
//    public class ATM{
//        Scanner sc= new Scanner(System.in);
//        public String statment;
//        int accountbalance=10000;
//        synchronized public void withdraw(int amount){
//
//            if (amount>accountbalance){
//                System.out.println("insuffient fund" );
//                System.out.println("if u need  i will give some credit limit  if u want to use ,just enter yes or no ");
//                statment=sc.next();
//
//
//
//
//                try{
//                    wait();
//                }
//                catch (InterruptedException e){
//                    System.out.println("thank you for waiting ");
//                }
//                accountbalance=accountbalance-amount;
//
//            }
//            else{
//                System.out.println("trastion is completed");
//            }
//        }
//
//        synchronized public void deposit(int entredMoney){
//            System.out.println("we are depositing here");
//            accountbalance=accountbalance+entredMoney;
//            notify();
//            System.out.println("deposite completed");
//        }
//
//        public static void main(String[] args) {
//            intervivew.Chocolates.ATM a=new intervivew.Chocolates.ATM();
//            Thread t1=new Thread(){
//                @Override
//                public void run() {
//                    a.withdraw(20000);
//                }
//            };
//            t1.start();
//            Thread t2=new Thread(){
//                @Override
//                public void run() {
//                    a.deposit(30000);
//                }
//
//            };
//            if (a.statment=="yes"){
//                t2.start();
//
//            }
//
//
//
//
//
//        }
//    }
//
//}
