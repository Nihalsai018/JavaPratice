package collections.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortOne {
    public static void main(String[] args) {
//        ArrayList<Integer> i=new ArrayList<>();
//        i.add(2);
//        i.add(4);
//        i.add(5);
//        i.add(6);
//        i.add(7);
//        i.add(1);
//       Collections.sort(i);
//        System.out.println(i);


        /// problem two-----------------------------------------------------------------------------
//        ArrayList<String> al=new ArrayList<String>();
//        al.add("Sai");
//        al.add("apple");
//        al.add("Bannana");
//        al.add("nihal");
//
////        Collections.sort(al);
////        Collections.reverse(al);
////
//        Collections.sort(al,Collections.reverseOrder()); // now we get know the diffrence between reverse and reverse oder
//
//
//
//
//        for (String s:al) {
//            System.out.println(s);
//
//        }


        //problem thre--------------------------------------------------------------------------

//        ArrayList al = new ArrayList();
//        al.add(1);
//        al.add(2);
//        al.add(Integer.valueOf(201));
//        al.add(Integer.valueOf(101));
//        al.add(23);//internally will be converted into objects as Integer.valueOf(230)
//        al.add(150);
//
//        Collections.sort(al);
//
//        Iterator itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//
//        }

        //progrm 4 syncoried

        List<String> list = new ArrayList<String>();
        //Add values in the list
        list.add("z");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("a");
    //    System.out.println(list);
        //Create a synchronized list
        List<String> synlist = Collections.synchronizedList(list);
        System.out.println("Synchronized list is :"+synlist);
    }
}



