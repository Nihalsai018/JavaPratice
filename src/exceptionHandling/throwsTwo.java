package exceptionHandling;

import java.io.IOException;

public class throwsTwo {
    void m()throws IOException {
        System.out.println("nihal");
       throw new IOException("device error");//checked exception
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }
        catch(IOException e)
        {
            System.out.println("exception handled");
        }
    }
    public static void main(String args[]) throws Exception{
        throwsTwo obj=new throwsTwo();
        obj.p();

    }
}
