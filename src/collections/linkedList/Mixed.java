package collections.linkedList;

import java.util.*;

public class Mixed {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("ravi");
        list.add("Vijay");
        list.add("Ajay");

       HashSet<String> set=new HashSet(list);
       // List<String> set=new ArrayList<>(list);
        set.add("Gaurav");
        set.add("ravi");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
