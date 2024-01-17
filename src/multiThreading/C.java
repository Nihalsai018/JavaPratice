package multiThreading;

public class C implements Runnable{
    @Override
    public void run() {
       for (int i=0;i<=100;i++){
           System.out.println("nihal "+ i);
       }
    }
}
class D implements Runnable{
    @Override
    public void run() {
      for (int i=0;i<=100;i++){
          System.out.println("gade " +i);
      }

    }

    public static void main(String[] args) {

        C c=new C();
        D d=new D();

        Thread t1=new Thread(c);
        Thread t2=new Thread(d);

        c.run();
        d.run();



    }
}
