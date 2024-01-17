package collections.linkedList;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListone {
  //  public static ArrayListone nihal;

    public static void main(String[] args) {

       ArrayList <String>a =new ArrayList();


        a.add("nihal");
//        a.add(11);
//        a.add(33);
        a.add("gade");
        a.add ("gade");
        a.add("sai");a.add("a");a.add("z");
        a.set(0,"kanna");

        a.add(5,"sahithi"); // array size emo fix 4 but vales alaa add ithuni
        a.add(6,"sahithi"); // array size emo fix 4 but vales alaa add ithuni // if in case if we update insted of 6 to 7 throw error becuase arrylist nedd contions
        //a.set(1,2); // throws error because adding is diffrect and set vallues is diffrent
        a.set(7,"navya"); // throws error because adding is diffrect and set vallues is diffrent // trows exception bcs we cannot exxed the index in array

        System.out.println(a.size());







      //  System.out.println(a);

// --------------------------------using for loop acessing values


        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
//-----------------------using for each loop
//        for (Object i:a){
//            System.out.println(i);
//
//        }

     //   --------------------using iterator acessing valuues
//        Iterator<String> i=a.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }

       // --------------------using list iterator acesing values

      //  System.out.println("-------by using next meanss  frowrad  to backward------------");

//        ListIterator<String> i=a.listIterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//
//
//        System.out.println(" -----previous  using   means backward to frowrad----------");
//
//
//
//        ListIterator<String> ii=a.listIterator(a.size());
//        while(ii.hasPrevious())
//        {
//            System.out.println(ii.previous());
//        }

// .........................by using for each method lamda expresion
//        a.forEach(b-> {System.out.println(b);});
//
//     //   ........................................//Here, we are using lambda expression
//
//
//
//        Iterator<String> itr=a.iterator();
//        itr.forEachRemaining(b->
//        {
//            System.out.println(b);
//        });
        System.out.println(a.size()+"  sixe of array");

        System.out.println(a+"normal list");
        Collections.sort(a);

        System.out.println(a+"sorted list");

        Collections.reverse(a);

        System.out.println(a+"revesre of list");









    }
}
