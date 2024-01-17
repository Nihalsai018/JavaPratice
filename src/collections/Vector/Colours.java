package collections.Vector;

import java.util.*;

public class Colours {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
     //   ArrayList<String> v=new ArrayList<>();
       // TreeSet<String> v=new TreeSet<>();
        v.add("Red");
        v.add("Green");
        v.add("Yellow");
        v.add("White");

        v.addElement("Black"); // diff add method




        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            String color = it.next();
            System.out.println(color);
            if (color.equals("Green")) {
              //  v.remove("Green"); // This will throw ConcurrentModificationException
                //so remove from iterator
                it.remove();
            }
        }
        System.out.println("----------------------------------------");
        Enumeration<String> en = v.elements(); // Get an Enumeration

        while (en.hasMoreElements()) {
            String color = en.nextElement();

            System.out.println(color + " iterating using enumarator");

        }
        System.out.println("----------------------------------------");







        System.out.println(v+"       elemt removed sucessfully"); // now elemt is removed sucessfully from vector



        // some imp methods in vector
        Vector<String> vv=new Vector<>();


        System.out.println(v.capacity()+"  defalut capacity");
        System.out.println(v.size()+"  size");
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        if (v.contains("Red")){
            System.out.println("yes we have the element on index of:-"+ v.indexOf("Red"));
        }
        else{
            System.out.println("sorry there no such type of element");
        }
        Vector <String> clonedv= (Vector<String>) v.clone(); // shallow copy is done



        v.add("nihal");
        System.out.println(v);
        System.out.println(clonedv+"clonedd vector");



    }
}
