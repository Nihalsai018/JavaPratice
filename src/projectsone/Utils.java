package projectsone;

import java.util.ArrayList;
import java.util.List;

public class Utils {
  public  List<String> createList(String s1, String s2, String s3){
        List<String> a= new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
      //  System.out.println(a);
     //   return createList(s1,s2,s3);
        return a;



    }

}
class Main{
    public static void main(String[] args) {
        Utils list=new Utils();
        List<String> result =list.createList("nihal", "gopi", "sai");

        for (String a:result) {
            System.out.println(a);

        }

        System.out.println(result);

        String s="nihal";


        }
    }
