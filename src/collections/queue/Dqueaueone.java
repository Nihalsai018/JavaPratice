package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueaueone {
    public static void main(String[] args) {
        Deque<String> d=new ArrayDeque<>();
        d.add("nihal");
        d.offer("sai");
        d.offerFirst("gade"); // if it is list we have to use set and get by indexing values but here no ondexes
        d.offerLast("kanna");

        d.push("munny");
        System.out.println(d);

        d.peekFirst();
        System.out.println(d+"peek first");
        d.peekLast();
        System.out.println(d+"peek last");
        d.pollFirst();
        System.out.println(d+"poll first");
        d.pollLast();
        System.out.println(d+"poll last");
;
    }
}
