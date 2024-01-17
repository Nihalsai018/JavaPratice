package intervivew;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("enter a number to check prime or not");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
                count++;

            }
        }
        if(count<=2){
            System.out.println("it is prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}
