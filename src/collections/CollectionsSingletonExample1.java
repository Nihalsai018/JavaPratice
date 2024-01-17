package collections;

import java.util.*;
public class CollectionsSingletonExample1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        Collections.addAll(list, 1, 2, 4, 2, 7, 2, 4, 4);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
      //  Collections.singleton(4);
        list.removeAll(Collections.singleton(4));
        System.out.println(list+" removing 4");



        list.removeAll(Collections.singleton(2) ); // only remove all is used

        System.out.println(list+" removing 2");

    }
}