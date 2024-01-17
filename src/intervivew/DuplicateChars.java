package intervivew;

public class DuplicateChars {
    public static void main(String[] args) {
        String s = "abcdabcd";
        boolean foundFirstDuplicate = false;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i)== s.charAt(j)) {
                    if (foundFirstDuplicate) {
                        System.out.print(s.charAt(j));
                        return; // Stop the program after printing the second occurrence
                    } else {
                        foundFirstDuplicate = true;
                        break; // Exit the inner loop after finding the first duplicate
                    }
                }
            }
        }
    }
}
