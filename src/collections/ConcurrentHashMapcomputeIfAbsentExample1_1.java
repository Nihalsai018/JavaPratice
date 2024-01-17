package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapcomputeIfAbsentExample1_1 {

    public static void main(String[] args)
    {
        // crete a HashMap and add some values
        HashMap<String, Integer> mapcon = new HashMap<>();
        mapcon.put("k1", 100);
        mapcon.put("k2", 200);
        mapcon.put("k3", 300);
        mapcon.put("k4", 400);
        System.out.println("HashMap values :\n " + mapcon.toString());
        mapcon.computeIfAbsent("k5", k -> 200 + 300);
        mapcon.computeIfAbsent("k6", k -> 60 * 10);
        System.out.println("New HashMap after computeIfAbsent :\n "+ mapcon); // adding elments if absent


        ConcurrentHashMap<String, Integer> mymap = new ConcurrentHashMap<String,  Integer>();

        mymap.put("AAA", 10);
        mymap.put("BBB", 15);
        mymap.put("CCC", 25);
        mymap.put("DDD", 255);
        mymap.put("EEE",30);
        System.out.println(" Mappings are: " +mymap);

        System.out.println("is 255  present? :  "
                + mymap.containsValue(255));
    }
}
