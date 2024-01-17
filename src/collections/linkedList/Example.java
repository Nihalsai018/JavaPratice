package collections.linkedList;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        LinkedList <Integer> i=new LinkedList<>();
        i.add(20);
        i.add(30);
        i.add(40);
        i.add(50);
        i.add(60);




        System.out.println(i+" normal");
        System.out.println(i.get(2)+" get method");
        System.out.println(i.peek()+" Peek");
        System.out.println(i);
        System.out.println(i.poll()+" poll");
        System.out.println(i);
        System.out.println(i.pop()+" pop");
        System.out.println(i);
        System.out.println(i.remove()+"remove");
        System.out.println(i);

    }
}
