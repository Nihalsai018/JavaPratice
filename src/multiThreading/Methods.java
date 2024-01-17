package multiThreading;

class   A extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i+ " gade ");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread());
        }
    }
}

public class Methods extends Thread{
    @Override
    public void run() {
        for (;;){
            try {
                int j=0;

                Thread.sleep(22);
                System.out.println(" nihal"+ j++);
              //  System.out.println(Thread.currentThread());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void main(String[] args) {
//        A a=new A();
//        a.start();


        //---------------------------
        Methods m1=new Methods();
//        Methods m2=new Methods();
//        Methods m3=new Methods();
//        Methods m4=new Methods();
        A m2=new A();
       m1.setDaemon(true);

        m1.start();
        m2.start();


        //-----------join---------------------------------------------------
//        m1.start();
//        try{
//            m1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        m2.start();
//        try{
//            m2.join(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        m3.start();
//        m4.start();


    }
}
