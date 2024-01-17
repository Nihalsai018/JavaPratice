package collections.queue;

import java.util.*;

class Resturent implements Comparable<Resturent>{
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
       // return this.waiterName.compareTo(r.waiterName);
    }





    // Call the constructor to create a new instance of Resturent

        // You can use the newWaiter object or access its properties as needed





    public static void main(String[] args) {
        Resturent Rone = new Resturent(4, "ramesh", 25,"DayShift");
        Resturent RTwo = new Resturent(3, "nukesh", 40,"nightShift");
        Resturent RThree = new Resturent(6, "mukesh", 41,"nightshift");
        Resturent RFour = new Resturent(17, "suresh", 53,"DayShift");

      //  ArrayList<Resturent> a=new ArrayList<>();
      //  TreeSet<Resturent> a=new TreeSet<>();
        PriorityQueue<Resturent>a= new PriorityQueue<>();
        a.add(Rone);
        a.add(RTwo);
        a.add(RThree);
        a.add(RFour);
      //  Collections.sort(a);   // if we use list to sort we have to use this method
        System.out.println("actual quea");

       Iterator <Resturent>itr = a.iterator();
       while(itr.hasNext()){
           Resturent waiterlist= itr.next();
           System.out.println("id="+waiterlist.waiterId+" name="+waiterlist.waiterName+" Age="+waiterlist.waiterAge+" Shift="+waiterlist.waiterShift);
       }
       a.remove();
        System.out.println("....................after remove");
        for (Resturent waiterlist:a) {
            System.out.println("id="+waiterlist.waiterId+" name="+waiterlist.waiterName+" Age="+waiterlist.waiterAge+" Shift="+waiterlist.waiterShift);

        }
        a.peek();
        System.out.println("..............after peek");
        for (Resturent waiterlist:a) {
            System.out.println("id="+waiterlist.waiterId+" name="+waiterlist.waiterName+" Age="+waiterlist.waiterAge+" Shift="+waiterlist.waiterShift);

        }

        a.poll();
        System.out.println("...................after pool");
        for (Resturent waiterlist:a) {
            System.out.println("id="+waiterlist.waiterId+" name="+waiterlist.waiterName+" Age="+waiterlist.waiterAge+" Shift="+waiterlist.waiterShift);

        }
        System.out.println("...........................after operations");

        for (Resturent waiterlist:a) {
           System.out.println("id="+waiterlist.waiterId+" name="+waiterlist.waiterName+" Age="+waiterlist.waiterAge+" Shift="+waiterlist.waiterShift);
           // System.out.println(waiterlist); it prints hashcode
        }




    }


}


