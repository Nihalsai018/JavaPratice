package collections.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Resturent implements Comparable<Resturent>{

    public Resturent(){

    }
    int waiterId;
    String waiterName;
    int waiterAge;
    String waiterShift;

    public Resturent(int waiterId, String waiterName, int waiterAge, String waiterShift) {
        this.waiterId = waiterId;
        this.waiterName = waiterName;
        this.waiterAge = waiterAge;
        this.waiterShift = waiterShift;

    }
    @Override
    public int compareTo(Resturent r) {
        return Integer.compare(this.waiterId,r.waiterId);
    }
//    public int compareTo(Resturent r) {
//        return this.waiterName.compareTo(r.waiterName);
//    }




    public static void main(String... args) {
        Resturent object =new Resturent();
        Resturent Rone = new Resturent(4, "ramesh", 25,"DayShift");
        Resturent RTwo = new Resturent(3, "nukesh", 40,"nightShift");
        Resturent RThree = new Resturent(6, "mukesh", 41,"nightshift");
        Resturent RFour = new Resturent(17, "suresh", 53,"DayShift");

        ArrayList<Resturent> a=new ArrayList<>();
      //  TreeSet<Resturent> a=new TreeSet<>();
        a.add(Rone);
        a.add(RTwo);
        a.add(RThree);
        a.add(RFour);

        Collections.sort(a);  //if we use list to sort we have to use this method
        object.compareTo(Rone);

       Iterator <Resturent>itr = a.iterator();
       while(itr.hasNext()){
           Resturent waiterlist= itr.next();
           // System.out.println(a);

          System.out.println("id="+waiterlist.waiterId+" name="+waiterlist.waiterName+" Age="+waiterlist.waiterAge+" Shift="+waiterlist.waiterShift);
       }




    }


}


//using encasupation
//import java.util.*;
//
//class Resturent implements Comparable<Resturent> {
//    private int waiterId;
//    private String waiterName;
//    private int waiterAge;
//    private String waiterShift;
//
//    public Resturent(int waiterId, String waiterName, int waiterAge, String waiterShift) {
//        this.waiterId = waiterId;
//        this.waiterName = waiterName;
//        this.waiterAge = waiterAge;
//        this.waiterShift = waiterShift;
//    }
//
//    public int getWaiterId() {
//        return waiterId;
//    }
//
//    public String getWaiterName() {
//        return waiterName;
//    }
//
//    public int getWaiterAge() {
//        return waiterAge;
//    }
//
//    public String getWaiterShift() {
//        return waiterShift;
//    }
//
//    @Override
//    public int compareTo(Resturent r) {
//        return this.waiterName.compareTo(r.waiterName);
//    }
//
//    public static void main(String[] args) {
//        Resturent Rone = new Resturent(4, "ramesh", 25, "DayShift");
//        Resturent RTwo = new Resturent(3, "nukesh", 40, "nightShift");
//        Resturent RThree = aResturent(6, "mukesh", 41, "nightshift");
//        Resturent RFour = new Resturent(17, "suresh", 53, "DayShift");
//
//        TreeSet<Resturent> a = new TreeSet<>();
//        a.add(Rone);
//        a.add(RTwo);
//        a.add(RThree);
//        a.add(RFour);
//
//        Iterator<Resturent> itr = a.iterator();
//        while (itr.hasNext()) {
//            Resturent waiterlist = itr.next();
//            System.out.println("ID=" + waiterlist.getWaiterId() + " Name=" + waiterlist.getWaiterName() + " Age=" + waiterlist.getWaiterAge() + " Shift=" + waiterlist.getWaiterShift());
//        }
//    }
//}



//using encasupation
//import java.util.*;
//
//class Resturent implements Comparable<Resturent> {
//    private int waiterId;
//    private String waiterName;
//    private int waiterAge;
//    private String waiterShift;
//
//    public Resturent(int waiterId, String waiterName, int waiterAge, String waiterShift) {
//        this.waiterId = waiterId;
//        this.waiterName = waiterName;
//        this.waiterAge = waiterAge;
//        this.waiterShift = waiterShift;
//    }
//
//    public int getWaiterId() {
//        return waiterId;
//    }
//
//    public String getWaiterName() {
//        return waiterName;
//    }
//
//    public int getWaiterAge() {
//        return waiterAge;
//    }
//
//    public String getWaiterShift() {
//        return waiterShift;
//    }
//
//    @Override
//    public int compareTo(Resturent r) {
//        return this.waiterName.compareTo(r.waiterName);
//    }
//
//    public static void main(String[] args) {
//        Resturent Rone = new Resturent(4, "ramesh", 25, "DayShift");
//        Resturent RTwo = new Resturent(3, "nukesh", 40, "nightShift");
//        Resturent RThree = aResturent(6, "mukesh", 41, "nightshift");
//        Resturent RFour = new Resturent(17, "suresh", 53, "DayShift");
//
//        TreeSet<Resturent> a = new TreeSet<>();
//        a.add(Rone);
//        a.add(RTwo);
//        a.add(RThree);
//        a.add(RFour);
//
//        Iterator<Resturent> itr = a.iterator();
//        while (itr.hasNext()) {
//            Resturent waiterlist = itr.next();
//            System.out.println("ID=" + waiterlist.getWaiterId() + " Name=" + waiterlist.getWaiterName() + " Age=" + waiterlist.getWaiterAge() + " Shift=" + waiterlist.getWaiterShift());
//        }
//    }
//}

