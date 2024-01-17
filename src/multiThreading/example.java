package multiThreading;

import java.util.Scanner;

public class example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to do operation print even and odd number");
        int n=sc.nextInt();


        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i =1;i<n;i++){
                    synchronized (this) {
                        if (i % 2 == 0) {
                            System.out.println("these is even number:-" + i);
                        }
                    }

                }
                for (int j =1;j<n;j++){
                    synchronized (this) {
                        if (j % 2 != 0) {
                            System.out.println("these is odd number:-" + j);
                        }
                    }

                }
            }
        };
        t1.start();
    }


}
