package intervivew;

public class MethodD extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            try {
                int j = 0;

                Thread.sleep(22);
                System.out.println(" nihal" + j++);
                //  System.out.println(Thread.currentThread());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


    public static void main(String[] args) {

        MethodD d= new MethodD();
        d.setDaemon(true);
        d.start();


        Threadi t1 = new Threadi();
        t1.setName("nihal");
        t1.start();
        t1.setPriority(9);
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());


        Threadi t2 = new Threadi();
        t2.setName("sai");
        t2.start();


//        Thread t3=new Thread("nihal thread"){
//            public void run() {
//                for (;;){
//                    System.out.println("iam demon");
//                }
//            }
//        };
//
//
//
//        t3.setDaemon(true);
//        t3.start();
//
//        t3.setPriority(2);
//
//
//        String s=t3.getName();
//        System.out.println(s);


    }

}
