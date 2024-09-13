package java8.functionalInterface;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//@FunctionalInterface  // conattines only one abstract method n no of static and default method can be present
public class AfunctionalInterface implements Payemnts {

    public static void main(String[] args) {
      //  Runnable --> functional interface :- containes only  one abstract method run()
      //  Callable --> functional interface :-  call()
      //  Comparator--> //but it containes two method compare() and equals () then how it is functional interface
                        // reason the equals method is inhertied from object class so it not comes under the compartor interface


        //Interfaces introduced in JAVA *

      //  Function //--> apply() --> take one datatype of Arg and return another datatype
       //Consumer--> acccept() -->  take one datatype doesnt return any datatype
      //  Supplier--> get()---> doesnt take any data type but return one datatype
      //  Predicate--> test()--> take one data type and evalute return bollen either true or false

    }


    @Override
    public String doPayment(String source, String destination) {
        return null;
    }
}
