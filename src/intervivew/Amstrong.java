package intervivew;

public class Amstrong {

    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int digit;
        int result = 0;
        int size=String.valueOf(n).length();
        while (n>0){
            digit=n%10;
            result+=Math.pow(digit,size);
            n=n/10;
        }
        if (temp==result){
            System.out.println("it is amstrong");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}
