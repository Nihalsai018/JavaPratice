package collections.linkedList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedList<I extends Number> {
    public static void main(String args[]){
        //Creating HashSet and adding elements
       Set<String> set=new HashSet();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set= Collections.synchronizedSet(set);
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: "+set);
        //System.out.println(set);

        //======================================================
        synchronized(set){
            for (String s : set) {
                System.out.println(s);

            }
        }
        synchronized (set) {
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

    }
}

