package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        // revsers
        Collections.reverse(numbers); // to reveres a number

        System.out.println("reverse List: " + numbers);

        //Rotate the list by distance
        Collections.rotate(numbers,3);
        System.out.println("roated list"+numbers);
    }
}
