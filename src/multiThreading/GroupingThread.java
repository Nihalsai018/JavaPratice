package multiThreading;

public class GroupingThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("parentThread");
        GroupingThread g=new GroupingThread();

        Thread t1=new Thread(tg1,g,"first");
        Thread t2=new Thread(tg1,g,"second");
        Thread t3=new Thread(tg1,g,"third");

        t1.start();
        t2.start();
        t3.start();
        System.out.println("thread group name:-"+tg1.getName());
       tg1.list();


    }
}
