package exceptionHandling;

import oops.Static;

import java.io.IOException;

public class propagation {

    void m()   {
        int data=50/0;
        //throw new java.io.IOException("device error");
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        propagation obj=new propagation();
        obj.p();
        System.out.println("normal flow...");
    }
}
