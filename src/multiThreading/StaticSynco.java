package multiThreading;

class Atm extends Thread{
    static int balance=2000;

    public  static  synchronized void withdraw( int amount){
        if(amount<balance){
            System.out.println(" Transation  sucessfull");
            balance=balance-amount;
            System.out.println("current balance is "+ balance+ "      "+Thread.currentThread());
        }
        else{
            System.out.println("in Sufficeent balance ");
        }

    }

    @Override
    public void run() {
        withdraw(200);
    }
}

public class StaticSynco {
    public static void main(String[] args) {
        Atm sbi=new Atm();
        Thread t1=new Thread(sbi);
        Thread t2=new Thread(sbi);
        Atm yesBank=new Atm();
        Thread t3=new Thread(yesBank);
        Thread t4=new Thread(yesBank);


        t1.start();
        t2.start();
        t3.start();
        t4.start();





    }




}
