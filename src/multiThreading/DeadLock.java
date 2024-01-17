package multiThreading;

public class DeadLock implements Runnable{
    public String resourceOne="javabook";
    public String resourceTwo="pythonbook";

    public void ResourceOne() {
        synchronized (resourceOne){
            System.out.println("nihal took javabook");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resourceTwo){
                System.out.println("nihal wants javabook now");
            }
        }
    }
    public void ResourceTwo() {
        synchronized (resourceTwo){
            System.out.println("navya took Pythonbook");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resourceOne){
                System.out.println("navya wants javabook now");
            }
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName()=="nihal"){
            ResourceOne();
        }
        else{
            ResourceTwo();
        }

    }

    public static void main(String[] args) {
        DeadLock d=new DeadLock();
        Thread t1=new Thread(d);
        Thread t2=new Thread(d);
        t1.setName("nihal");
        t2.setName("navya");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
