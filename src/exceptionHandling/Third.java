package exceptionHandling;

public class Third {
    public static void agee(int age){
        if (age<18){

            throw  new ArithmeticException("he is not eligble");
        }
        else {
            System.out.println("ypu are elgible");
        }

    }
    public static void main(String[] args) {
        agee(19);

    }
}
