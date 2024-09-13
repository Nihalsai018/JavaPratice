package java8.streamsP;

// Stream Api :- it is useed to process the collection of objects with function style of coding by using Lamda expression
// What is streams :- it

import java8.MethodRefrenceP.PracticeTest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class APraticeStreams {
    public static void main(String[] args) {




        List<Integer> myList = Arrays.asList(11,10,2,3,33,20,26,74,4,57, 30,7,8);



      //  External iterration :- for loop , enanced for loop , iterator

//        for (int i =0 ;i<myList.size();i++){
////            System.out.println(myList.get(i));  //  for loop
////        }
////        for (int i : myList){
////            System.out.println(i);             // enanced for loop  or external loop
////        }

//        Iterator iterator= myList.iterator();  //iterator is esay to modify
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //Internal iteration:- lamda and method referance

//        myList.forEach(i-> System.out.println(i));   // for each method conatines Consumer interface

//        myList.stream().filter(i->(i>4)).sorted().forEach(i-> System.out.println(i)); //lamda  // filter method contain Predicate interface
//        myList.stream().filter(i->(i>4)).sorted().forEach(System.out::println);       //method referenece
//        myList.stream().filter(i->(i>4)).sorted().forEach(PracticeTest::test1);       //method referenece by  custom static method
//       PracticeTest test=new PracticeTest();
//        myList.stream().filter(i->(i>4)).sorted().forEach(test::test2);//method referenece by custom non static method
        System.out.println("-----------------------thelusuko----------------------------------");

      //  myList.parallelStream() --> if we have large amount of data to process , mutiple threads work to copmplte ethe task
        System.out.println("------------------------------------ printing ");
      List<Integer> result=  myList.stream().map(m->m*m).collect(Collectors.toList());
        System.out.println(result);

        System.out.println("------------------------------use of lamada");

        myList.stream().map(i->i*i).sorted().forEach(i-> System.out.println(i)); //here map works with Function interface
        System.out.println("-------------------------methodRefrence");
        myList.stream().map(i->i*i).filter(i->i>20).sorted().forEach(System.out::println);

        System.out.println("--------------------streams cant use again ");
        myList.stream().forEach(i-> System.out.println());
        myList.stream().forEach(i-> System.out.println());//.............? why i am able to use again

        System.out.println("working on reduce :-"+myList.stream().reduce(0,(m,n)->m+n));

        System.out.println("---------methods of stream");

      Long myCount = myList.stream().count();
        System.out.println(" count of recods in Mylist :-"+myCount);


        Integer resultReduce=  myList.stream().map(m->m*m).reduce(0,(m,n)->m+n);
        System.out.println(result);


        //here  Filter and Map are lazy functions and findFirst is eager method

        System.out.println("----------------------lazy and eager methods");

        System.out.println(myList.stream()
                .filter(i->i%5==0)
                .map(i->i*i)
                .findFirst()
                .orElse(0));    // here stream works from findfirst bcz it is eager method

        //Note: bcz why we need to perfrom the operation  all the methods in list
//        steps first stream will convert collection of objects , then filter will say iam done but actually it wont perfrom
//                them map iaslo like fileter it is also say am done , but find first will eager method
//                now it will ask map give me first element , mwp ask to filter  this is processs
        System.out.println("stream  by method refrenece ");

        System.out.println(myList.stream().
                filter(CustomStreamMethods::fileterBy5)
                .map(CustomStreamMethods::mapDouble)
                .findFirst()
                .orElse(0));













    }
}
