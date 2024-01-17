package exceptionHandling;

import java.util.Scanner;

public class hrow {


    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the position of index u want");
            int n=sc.nextInt();
            int[] marks={12,13,15,18};

                if(n>marks.length){
                    throw new NihalException("here u are enterd above the length of array size");
                }
                else {
                    System.out.println(marks[n]);
                }

        }
        catch (NihalException m){
            System.out.println("went wrong"+ m );


        }

    }
}
