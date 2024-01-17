package collections.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MethodsofArrays {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(20);
        b.add(30);
        b.add(11);
        b.add(24);
        b.add(4);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0,1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);


        Collections.reverse(a);
//        System.out.println(a); // accesing the arrylist printing output
//        System.out.println(a);
//        System.out.println(a.get(3)); // geting output to console
        a.addAll(b); //here we  are adding two lists
        System.out.println(a);
        System.out.println(a.subList(0,3));// making substring
        System.out.println(a.indexOf(24)); // geting value from specifc index
        System.out.println(a.lastIndexOf(4));

        Iterator it =a.iterator();



    }
}
