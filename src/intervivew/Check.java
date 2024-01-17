package intervivew;

import oops.Static;

class Gade extends Exception{
    Gade(String s){
        super(s);
        System.out.println("iam gade exception");
    }
}

class Time{
    public static void main(String[] args) {
        try{
            if(8>7){
                throw new Gade("check whether working or not ");
            }
        }
        catch (Gade g){
            System.out.println(g.getMessage());
            System.out.println("here iam handling to cointune the flow of excuetiion");
            System.out.println(g);
        }

    }




}

public class Check {


    void methodOne(){
        String s="Nihal";
        System.out.println(s.charAt(17));
    }

    void methodtwo(){
        methodOne();
    }


    void methodThree() throws Exception{
        methodtwo();
    }

    void method(){
        try{
            int i=1/1;
            try{
                int j=2/2;

                try{
                    int k=3/3;
                }
                catch (ArithmeticException a){
                    System.out.println();
                }
            }
            catch (Throwable t){
                System.out.println("iam finally"+t);
            }
        }
        catch (ArithmeticException a){
            System.out.println("iam air");
        }
        catch (Exception e){
            System.out.println("iam catch "+e);
        }

        finally {
            System.out.println("iam nihal in finally");
        }
    }



}
class print{
    public static void main(String[] args) {
        Check c= new Check();
        try {
            c.methodThree();
        }
        catch (Exception e){
            System.out.println("iam handling the the method 3 exception here  ");
        }

    }

}
