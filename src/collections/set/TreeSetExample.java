package collections.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> i=new TreeSet<>();
        i.add(120);
        i.add(40);
        i.add(60);
        System.out.println(i);
        System.out.println(  i.ceiling(60));
        System.out.println(  i.higher(60));

        System.out.println(  i.floor(60));
        System.out.println(  i.lower(60));


    }
}
