package java8.lamdba;

import java8.functionalInterface.Payemnts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PraticeLamda // what is lamda --> it is use to crete the instance of the functional interface//.............? why i am able to use again


{
    public static void main(String[] args) {



        System.out.println("------------------------------- Lamda with implimentions --------------------------------");

        Payemnts payemnts = new Payemnts() {  // anonymus class
            @Override
            public String doPayment(String source, String destination) {
                return"Payment from " + source + " to " + destination + " is successful!";
            }
        };



           Payemnts payemnts1 =(source, destination)->{ return "Payment from " + source + " to " + destination + " is successful!";};



        // by using lamda expresiion

        Payemnts pay = (source, destination) -> {return " payment recived from " + source + " paied to " + destination;};
        Payemnts payment = (source, destination) -> "Payment from " + source + " to " + destination + " is successful!";


      String s=  payemnts.doPayment("nihal","nikhil");
      String s1=  pay.doPayment("nihal","nikhil");
      String s2=  payment.doPayment("nihal","nikhil");


        System.out.println( " annoyms class--> " + s  +  "\n lamda with braces--> " + s1  + System.lineSeparator() +" lamda without braces ---->" + s2) ;

        // exaples to implement the java 8 functional interfces

        System.out.println("-------------------------------------------------------------------------------------------");

        Function <Integer,String> yearToCentry = (year)->
        {
            int century = (year/100 +1);
            return year + " falles under "+ century + " century";
        };

        System.out.println("1) Function Interface :- "+ yearToCentry.apply(2020));

        System.out.println("-------------------------------------------------------------------------------------------");


        Consumer<Integer> printSquare = (i) -> System.out.println("2) Consumer Interface :- The square of" + i + " is "+ i*i);
        printSquare.accept(5);

        System.out.println("------------------------------------------------------------------------------------------");

        Supplier <String> supplier = ()-> "3) supplier interface :- " + "Welocome to supplier interface ";
        System.out.println(supplier.get());

        System.out.println("------------------------------------------------------------------------------------------");


        Predicate<Integer> eligbleForVote = (i)-> i>18;
        System.out.println("4) Predicate interface :-");
        System.out.println(eligbleForVote.test(16));
        System.out.println(eligbleForVote.test(19));

        System.out.println("-------------------------------------------------------------------------------------------");







    }
}
