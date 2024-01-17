package collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Abbas {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>();
        i.add(2);
        i.add(2);
        i.add(22);
        i.add(22);
        i.add(23);
        i.add(21);
        System.out.println(i);

        Set<Integer> ii=new HashSet<>(i);
        System.out.println(ii);




    }
}
