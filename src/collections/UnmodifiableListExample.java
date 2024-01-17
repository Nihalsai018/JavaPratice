package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListExample {
    public static void main(String[] args) {
        // Create a modifiable ArrayList
        List<Integer> modifiableList = new ArrayList<>();
        modifiableList.add(1);
        modifiableList.add(2);
        modifiableList.add(3);

        // Create an unmodifiable view of the list
        List<Integer> unmodifiableList = Collections.unmodifiableList(modifiableList);
        //unmodifiableList.add(7); if we add complier throw the unsopretedexception

       //  Try to modify the unmodifiable list
        try {
            unmodifiableList.add(4); // This will throw an UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Attempt to modify unmodifiable list resulted in an UnsupportedOperationException.");
        }

        // The original list can still be modified
        modifiableList.add(5);
        System.out.println("Modified original list: " + modifiableList);

        // But the unmodifiable view remains unchanged
        System.out.println("Unmodifiable list: " + unmodifiableList);
    }
}
