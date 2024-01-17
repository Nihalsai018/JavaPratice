package collections;


import java.util.ArrayList;
import java.util.Collections;

public class FamilyComprable implements Comparable<FamilyComprable>{
    private  String name;
    private int age;


    public FamilyComprable(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(FamilyComprable o) {
        return Integer.compare(this.age,o.age);
    }

    public static void main(String[] args) {
       ArrayList<FamilyComprable> al=new ArrayList<>();
     //   TreeSet<Family> al=new TreeSet<>();

        al.add(new FamilyComprable("veena",45));
        al.add(new FamilyComprable("nikhil",24));
        al.add(new FamilyComprable("nihal",22));
        al.add(new FamilyComprable("srinivas",47));


        Collections.sort(al);



      //  Collections.sort(al,Collections.reverseOrder());





        for (FamilyComprable f:al) {
            System.out.println("age:-"+f.age+" name:-"+f.name);

        }
      FamilyComprable max=  Collections.max(al);
        System.out.println("In Family the max age is:-"+max.age+"("+max.name+")");


        FamilyComprable min=  Collections.min(al);
        System.out.println("In Family the max age is:-"+min.age+"("+min.name+")");


    }








}
