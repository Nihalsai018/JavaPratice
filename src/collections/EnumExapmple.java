package collections;


import org.w3c.dom.ls.LSOutput;

import java.util.EnumSet;
import java.util.Set;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, saturday
}
public class EnumExapmple {
    public static void main(String[] args) {
        Set<days> s= EnumSet.of(days.MONDAY);
        System.out.println(s);
        Set<days> sone= EnumSet.allOf(days.class);
        System.out.println(sone);
        Set<days> snone=EnumSet.noneOf(days.class);
        System.out.println(snone);

    }


}
