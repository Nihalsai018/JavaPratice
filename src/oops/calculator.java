package oops;

public interface calculator {
    void sum();
}

interface calculatorr extends  calculator{
    void sub();
}

class a implements calculatorr {
    @Override
    public void sum() {
        System.out.println("a+b");
    }

    @Override
    public void sub() {
        System.out.println("a-b");
    }
}
class b implements calculatorr {

    @Override
    public void sum() {
        System.out.println("a++");
    }



    @Override
    public void sub() {
        System.out.println("a--");

    }



    public static void main(StringOne[] args) {
        a x=new a();
        b y =new b();

        x.sub();
        x.sum();
        y.sub();
        y.sum();







    }
}
