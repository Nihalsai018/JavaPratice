package java8.MethodRefrenceP;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class OutPut {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,2,3,33,26,74,4,57,7,8);


        System.out.println("by using default printing technique");
        myList.stream().forEach(System.out::println);  //we know call by value , //call by refrenec // this is call by method

        System.out.println("by using custom static  method refrenece ");
        myList.stream().forEach(PracticeTest::test1);  // static methods

        System.out.println("by using custom non static methf refeance  ");
        PracticeTest objTest = new PracticeTest();
        myList.stream().forEach(objTest::test2);  // non  static methods


        System.out.println("OutPut.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("objTest = " + objTest);
    }
}
