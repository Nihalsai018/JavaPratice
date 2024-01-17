package collections.set;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class Exaple {
    public static void main(String[] args) {
       // Set<Integer> m=new HashSet<>();
        TreeSet<Integer> s=new TreeSet<>();
        s.add(10);
        s.add(11);
        s.add(14);
        s.add(16);
        s.add(11);s.add(12);s.add(13);s.add(14);s.add(15);s.add(16);



        System.out.println(s);
        System.out.println("by using for each");

        for (int i:s) {
            System.out.println(i);

        }
        System.out.println("'---------------------by using itertor");
        Iterator it =s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("by using deseding iterator");
        Iterator itd = ((TreeSet<Integer>) s).descendingIterator();
        while (itd.hasNext()){
            System.out.println(itd.next());
        }

        System.out.println("--------------------deseding oder");
        System.out.println(s.descendingIterator());

        System.out.println("-------------------subset");
        System.out.println(s.subSet(11,15));
        System.out.println(s.headSet(13));
        System.out.println(s.tailSet(14));


    }
}
