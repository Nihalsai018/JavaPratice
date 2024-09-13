package java8.functionalInterface;
@FunctionalInterface
   public interface Payemnts {

      abstract String doPayment(String source , String destination);
   //abstract String toTest(String source , String destination); donesntt conatin 2 methonds only one method

   default  String strachCard(String name){
       return name + " you have earned the Strach card";
   }

   public static void display(){
      System.out.println("welcome to payments");
   }

}
