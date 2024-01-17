package multiThreading;



public class SetPriority extends Thread {
    public void run() {
        //System.out.println("running thread name is:" + Thread.currentThread().getPriority());
        for (int i=1;i<10;i++){
            System.out.println("hi");

        }
        System.out.println(currentThread().getName());
        System.out.println(currentThread().threadId());

    }


}
class E extends Thread {
    char c = 'a';

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("hello");

        }
        System.out.println(currentThread().getName());
    }



    public static void main(String args[]) {




        SetPriority t1 = new SetPriority();

        E t2 = new E();
        // print the default priority value of thread
        t1.setPriority(7);// if it is greather than 10 throws IllegalArgumentException
        t1.setName("-----nihal");
        System.out.println(t1.getName());
        //t2.setPriority(3);
        t2.setName("-----------------------------------------------------------gade");
        System.out.println(t2.getName());
        System.out.println("thred t1 id :-"+t1.threadId());
        System.out.println(t2.threadId());

        //t2.setPriority(Thread.MIN_PRIORITY);
        // this will call the run() method
        System.out.println("Before t1 thread start:- "+t1.isAlive());
        t1.start();
        System.out.println("After t1 thread starts:- "+t1.isAlive());
        t2.start();
        System.out.println(Thread.currentThread().getName()+"thread");







    }
}


