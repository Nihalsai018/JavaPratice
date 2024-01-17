package multiThreading;

public class sai {

    synchronized public void display(int n){
          for (int i = 1; i <= 5; i++) {

             System.out.println(n+"*"+i+"="+n * i);}

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


          }

          public void add(int n){
        for (int i = 1; i <= 5; i++) {

            System.out.println(n+"+"+i+"="+ n + 1 );}

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }









     public static void main(String[] args) {
        sai s = new sai();
          Thread t1 = new Thread() {
             @Override
             public void run() {

                 s.display(5);
                 s.add(5);
             }
         };
          Thread t2 = new Thread() {
             @Override
             public void run() {

                 s.display(100);
                 s.add(100);
             }
         };
        t1.start();
        t2.start();
    }


}
