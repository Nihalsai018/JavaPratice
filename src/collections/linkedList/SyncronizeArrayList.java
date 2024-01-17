package collections.linkedList;
import java.util.*;

    public class SyncronizeArrayList {
        public static void main(String args[]) {
            // Non Synchronized ArrayList
            List<String> fruitList = new ArrayList<String>();

            fruitList.add("Mango");
            fruitList.add("Banana");
            fruitList.add("Apple");
            fruitList.add("Strawberry");
            fruitList.add("Pineapple");

            System.out.println(fruitList);

            // Synchronizing ArrayList in Java
            Collections.synchronizedList(fruitList);
            System.out.println(fruitList+"after synorzide");

            // we must use synchronize block to avoid non-deterministic behavior
//            synchronized (fruitList) {
//                Iterator<String> itr = fruitList.iterator();
//                while (itr.hasNext()) {
//                    System.out.println(itr.next());
//                }
//            }
            for (String names: fruitList) {
                System.out.println(names);
            }
        }
    }

