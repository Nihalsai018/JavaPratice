package exceptionHandling;
import java.io.IOException;

public class IOE {
          public static void readFromFile(String filename) throws IOException {
            // Simulate reading from a file
            // If the file does not exist or there's an issue reading it, IOException is thrown
            if (!fileExists(filename)) {
                throw new IOException("File not found: " + filename);
            }

            // Other file reading code goes here
        }

        public static boolean fileExists(String filename) {
            // Simulate checking if the file exists
            // In a real program, you would use file system operations
            return true; // Assume the file exists for this example
        }
    public static void main(String[] args) {
        try {
            readFromFile("example.txt");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }


}
