package intervivew;

public class A {
    public A(){
        super(); // refres to the object class constructor
        System.out.println("in A");
    }
    public A(int i){
        super();
        System.out.println("in int a");

    }
}
class B extends  A{

    public  B(){
        super();
        System.out.println("in B");
    }

    public B(int i){
       // super(); // it is inbuit
       // this();

        System.out.println("in int B");

    }

    public static void main(String[] args) {
        B b= new B(2);


    }
}