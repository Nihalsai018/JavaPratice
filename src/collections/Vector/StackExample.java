package collections.Vector;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> s=new Stack<>();

        System.out.println(s.empty()+" =before adding");
        System.out.println("====================here we are adding elemnts");
        s.push("Nihal");
        System.out.println(s);
        s.push("sai");
        System.out.println(s);
        s.push("gade");
        System.out.println(s);
        s.push("kanna");
        System.out.println(s);

        System.out.println("after adding :-"+s.empty());

//        System.out.println("---------------------------here we are removing the elemnts");
//
//        s.pop();
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);


        System.out.println(s.peek());


        System.out.println("serching element="+s.search("gade")); // returns index

        System.out.println("------------now using foreach");

        for (String names:s) {
            System.out.println(names);

        }




    }

}
