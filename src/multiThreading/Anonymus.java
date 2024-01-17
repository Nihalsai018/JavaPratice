package multiThreading;

class Nihal implements Runnable{

    @Override
   synchronized public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("nihal by run method " +i +" method 5");
        }

    }
}

public  class Anonymus extends Thread
{
    public static void main(String[] args) {

        System.out.println("hi welocme to all this is anonymus pratice section we are printing different programs by differnt methos");
       Thread a1 = new Thread()
       {
            @Override
           synchronized public void run() {
                System.out.println("this is using thread class method 1");
            }
        };
        Thread a2 = new Thread(new Runnable() {
            @Override
           synchronized public void run() {
                System.out.println("this is using runbale interfece anonusym class runamble method 2");
            }
        });

        Thread b1 = new Thread(() -> {
            synchronized (new Object()) {
                System.out.println("this is using lambda expression" + " method 3");
            }
        });





        Thread t1 = new Thread() { //using thread class anonymus class
            @Override
            synchronized public void run() {
                for (int i = 0; i < 10; i++) {
                    {
                        System.out.println("gade " + i + " thread method 4");
//                        System.out.println("1");
//                        System.out.println("2");
//                        System.out.println("3");
//                        System.out.println("4");
                    }
                }

            }
        };
//        Runnable t2 = new Runnable() { // using direct runnadble interface anounysm
//            @Override
//           synchronized public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("nihal by run method " +i +" method 5");
//
//                }
//            }
//        };
        Runnable t3 = new Runnable() { // using direct runnadble interface anounysm
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(80);
                        System.out.println("nihal printing using runnable by start " + i +" method 6");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };


        a1.start();

        a2.start();
       // b1.start();
        t1.start();

        Nihal n= new Nihal();
        Thread t4=new Thread(n);
        t4.start();



        new Thread(t3).start();





    }
}

