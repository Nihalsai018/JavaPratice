package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool extends Thread {
    public void display(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread()+"started");
        display();
        System.out.println(Thread.currentThread()+"ended");

    }

    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(5);



    }

}
