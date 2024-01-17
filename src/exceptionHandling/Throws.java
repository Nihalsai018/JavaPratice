package exceptionHandling;

public class Throws {
    public  void display() throws  Exception {
        // Attempt to load a non-existent class
        Class.forName("exceptionHandling.Thid");

        throw new ClassNotFoundException("iam class not found exception handled by main");
    }

   static {
      System.out.println("dummy");
    }
    public static void main(String[] args) {
        try {
            Throws t = new Throws();
            t.display();
        } catch (Exception e) {
            System.out.println("here i handled :" + e.getMessage());



        }


    }




}



