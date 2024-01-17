package collections;
    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiThreadedExample {
        public static void main(String[] args) {
            // Create an ArrayList
            List<Integer> list = new ArrayList<>(); // if we are not syncoried the out not be correct actual output shoub be 2000 but ishows defalut output ie 1245 somthing random

          //   Create a synchronized list
            List<Integer> synList = Collections.synchronizedList(list); //  this is method ....now we are synorizing the list go get output as 2000

            // Create multiple threads
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    synList.add(i);
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 1000; i < 2000; i++) {
                    synList.add(i);
                }
            });

            // Start the threads
            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Ensure that all elements are added
            System.out.println("Synchronized list size: " + synList.size());
            System.out.println(synList.indexOf(60));
        }
    }


