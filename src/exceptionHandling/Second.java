package exceptionHandling;

import java.sql.SQLException;

public class Second {
        static int i=50;
        public static void main(String[] args)   {
            try{
                int[] b={1,2,3,4,5};
                System.out.println(b[4]);
                int result =i/2;
                System.out.println(result);
                System.out.println("nihal");


            }
//            catch (Exception e){ // if i remove this it shows error because above thre is two need two haddle but  due to abiguity parent class exception is confuse to which one to handdle
//                                  // fix:- shift catch block to 3rd catch block

//            }


            catch(ArithmeticException a){
                System.out.println("Arithametic exception A error i handled");
            }
            catch (ArrayIndexOutOfBoundsException e){

                System.out.println("array exception handler");
            }

            finally {
                System.out.println(" finally is this");

            }




        }


}
