package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Examplecollection {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList(10);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
       // System.out.println(c);
        for (int i:c) {
            System.out.println(i);

        }
    }

}
