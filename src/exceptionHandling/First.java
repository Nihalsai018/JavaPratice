package exceptionHandling;

import  jdk.jfr.StackTrace;

public class First {

    public static void main(String[] args)   {
        try{
            int[] b={1,2,3,4,5};
            System.out.println(b[8]);
            ////---------------------------------

            int result =60/0;
            System.out.println(result);


        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("array exception handler");
        }


//        catch(ArithmeticException a){// this catch is not handled becsuse flow of exceution stopes after when we get excetion in try so to fix: if u nedd exection is there not just pass code in finally  just for knowing
//            System.out.println("Arithametic exception AIerror");
//        }


//        finally {
//            System.out.println(" finally is this");
//            int[] b={1,2,3,4,5};
//            System.out.println(b[3]);
//            int result =i/0;
//            System.out.println(result); // it shows the problem of arthematic
//
//        }


        }
}
