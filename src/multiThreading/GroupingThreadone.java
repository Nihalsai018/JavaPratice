package multiThreading;

public class GroupingThreadone extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadGroup g =new ThreadGroup("Group of parentThread");
        GroupingThreadone t11 = new GroupingThreadone();
        GroupingThreadone t12 = new GroupingThreadone();
        GroupingThreadone t13 = new GroupingThreadone();
        Thread t1=new Thread(g,t11,"one");
        Thread t2=new Thread(g,t12,"two");
        Thread t3=new Thread(g,t13,"three");
        t1.start();
        t2.start();
        t3.start();





    }
}
