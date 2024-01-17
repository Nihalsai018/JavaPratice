package collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapOne {
    public static void main(String[] args) {
     //   HashMap<String,Integer> m=new HashMap<>();
       // Map<String,Integer> m=new Hashtable<>();
        TreeMap<String,Integer> m=new TreeMap<>();
        m.put("mihal",25);
        m.put("sai",22);
        m.put("gade",26);
        m.put("mihal",21);
        m.put("nikhil",25);
        m.put("veena",25);

        System.out.println(m);
        System.out.println(m.keySet()+"keys");
        System.out.println(m.entrySet()+"enterys");


//        System.out.println("normal map ");
//
//
//        System.out.println(m);
//
//        System.out.println("///using keyset   storing set in for loop and iterting each of key of set and using of get(key)=value logic ");
//
//        for (String name:m.keySet()) {
//            System.out.println(name+":-"+ m.get(name));
//
//        }
//        System.out.println("by using entry set logic");
        System.out.println("-------------------map---------------------");
   for (Map.Entry n:m.entrySet()) {

       System.out.println("Keys:-"+n.getKey()+"  values:-"+n.getValue());
        }
        System.out.println("--------------------------------------------");


        System.out.println("here we are comparing by using keys and valued by sorting with stream intreface");
        m.entrySet().stream() .sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
             //   .sorted(Map.Entry.comparingByKey())











    }
}

