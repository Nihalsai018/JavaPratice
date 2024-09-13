package java8.streamsP;

public class CustomStreamMethods {
    public static boolean fileterBy5(int i){
        System.out.println("present value is "+i);
        return i%5==0;
    }
    public static int mapDouble(int i){
        System.out.println("present value is "+i);
        return i*i;
    }
}
