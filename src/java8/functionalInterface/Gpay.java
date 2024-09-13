package java8.functionalInterface;

public class Gpay implements Payemnts {
    @Override
    public String doPayment(String source, String destination) { // it is mandtory to over ride
        Payemnts.display();                                      // common logic act as utill class
        String earned =strachCard(source);                       // but it wont ask to over ride it is pure optional
        return source + " paid " + destination + " recived " + " "  +earned;
    }



    public static void main(String[] args) {
        Gpay payment =new Gpay();
       String statment= payment.doPayment("nihal","nikhi");
        System.out.println(statment);
    }
}
