package oops;

public abstract class Abstraction {
   abstract void men();
   abstract void age();




}
class student extends  Abstraction{

    @Override
    void men() {
        System.out.println("men age is up to 20 is student age");
    }

    @Override
    void age() {
        System.out.println("20");
    }
}
class adult extends Abstraction{
    @Override
    void men() {
        System.out.println("men age is 20 to 25 is adult age");
    }
    void age() {
        System.out.println("20 to 25");
    }
}
class husband extends Abstraction{
    void men(){
        System.out.println("men after he get marry now he act as a husband");
    }
    void age() {
        System.out.println("25 to 60");
    }
}
class oldperson extends  Abstraction{
    @Override
    void men() {
        System.out.println("men act as grandfather at above 60 yerss");
    }
    void age() {
        System.out.println("60 above");
    }
}
class disply{
    void disply(Abstraction a){
        a.age();
        a.men();
    }


    public static void main(StringOne[] args) {
        student m1=new student();
        adult m2=new adult();
        husband m3=new husband();
        oldperson m4=new oldperson();

        disply d=new disply();
        d.disply(m1);
    }
}

