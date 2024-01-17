package collections.map;

import java.util.*;

class Resturent {
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

    public static void main(String[] args) {
        Resturent Rone = new Resturent(4, "ramesh", 25, "DayShift");
        Resturent RTwo = new Resturent(3, "nukesh", 40, "nightShift");
        Resturent RThree = new Resturent(6, "mukesh", 41, "nightshift");
        Resturent RFour = new Resturent(17, "suresh", 53, "DayShift");

        HashMap<Integer, Resturent> m = new HashMap<>();

        m.put(1, Rone);
        m.put(2, RTwo);
        m.put(3, RThree);
        m.put(4, RFour);

//        List<Map.Entry<Integer, Resturent>> entryList = new ArrayList<>(m.entrySet());
//
//        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Resturent>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Resturent> entry1, Map.Entry<Integer, Resturent> entry2) {
//                return Integer.compare(entry1.getValue().waiterId, entry2.getValue().waiterId);
//            }
//        });

        for (Map.Entry<Integer, Resturent> entry : m.entrySet() ) { //for (Map.Entry<Integer, Resturent> entry : entrylist ) {
            System.out.println(entry.getKey() + ":-" + entry.getValue().waiterId + " " + entry.getValue().waiterAge
                    + " " + entry.getValue().waiterName + " " + entry.getValue().waiterShift);
        }
    }
}





//package collections.map;
//
//import java.util.*;
//
//class Resturent implements Comparable<Resturent> {
//    int waiterId;
//    String waiterName;
//    int waiterAge;
//    String waiterShift;
//
//    public Resturent(int waiterId, String waiterName, int waiterAge, String waiterShift) {
//        this.waiterId = waiterId;
//        this.waiterName = waiterName;
//        this.waiterAge = waiterAge;
//        this.waiterShift = waiterShift;
//    }
//
//    @Override
//    public int compareTo(Resturent other) {
//        return Integer.compare(this.waiterId, other.waiterId);
//    }
//
//    public static void main(String[] args) {
//        Resturent Rone = new Resturent(4, "ramesh", 25, "DayShift");
//        Resturent RTwo = new Resturent(3, "nukesh", 40, "nightShift");
//        Resturent RThree = new Resturent(6, "mukesh", 41, "nightshift");
//        Resturent RFour = new Resturent(17, "suresh", 53, "DayShift");
//
//        HashMap<Integer, Resturent> m = new HashMap<>();
//
//        m.put(1, Rone);
//        m.put(2, RTwo);
//        m.put(3, RThree);
//        m.put(4, RFour);
//
//        TreeSet<Resturent> sortedSet = new TreeSet<>(m.values());
//
//        for (Resturent resturent : sortedSet) {
//            System.out.println(resturent.waiterId + ":-" + resturent.waiterAge + " " + resturent.waiterName
//                    + " " + resturent.waiterShift);
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
////package collections.map;
//
//
//

//import java.util.Map;
//import java.util.TreeMap;
//
//class Resturent implements Comparable<Resturent> {
//    int waiterId;
//    String waiterName;
//    int waiterAge;
//    String waiterShift;
//
//    public Resturent(int waiterId, String waiterName, int waiterAge, String waiterShift) {
//        this.waiterId = waiterId;
//        this.waiterName = waiterName;
//        this.waiterAge = waiterAge;
//        this.waiterShift = waiterShift;
//    }
//
//    @Override
//    public int compareTo(Resturent other) {
//        return Integer.compare(this.waiterId, other.waiterId);
//    }
//
//    public static void main(String[] args) {
//        Resturent Rone = new Resturent(4, "ramesh", 25, "DayShift");
//        Resturent RTwo = new Resturent(3, "nukesh", 40, "nightShift");
//        Resturent RThree = new Resturent(6, "mukesh", 41, "nightshift");
//        Resturent RFour = new Resturent(17, "suresh", 53, "DayShift");
//
//        TreeMap<Integer, Resturent> m = new TreeMap<>();
//
//        m.put(1, Rone);
//        m.put(2, RTwo);
//        m.put(3, RThree);
//        m.put(4, RFour);
//
//        for (Map.Entry<Integer, Resturent> entry : m.entrySet()) {
//            System.out.println(entry.getKey() + ":-" + entry.getValue().waiterId + " " + entry.getValue().waiterAge
//                    + " " + entry.getValue().waiterName + " " + entry.getValue().waiterShift);
//        }
//    }
//}
