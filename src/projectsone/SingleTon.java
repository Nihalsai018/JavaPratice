package projectsone;

public  class SingleTon {
    private static SingleTon fillwater;

    private SingleTon() {

    }

    public static SingleTon getFillwater() {
        if (fillwater==null){
           fillwater=new SingleTon();
            return fillwater;
        }
        else {
            return fillwater;
        }
    }
    public void message(String name){
        System.out.println(name +"is filling water wait a moment then u can fill ,one after one");
    }
//    public static void main(String[] args) {
//        SingleTon s=SingleTon.getFillwater();
//        s.message("nihal ");
//        SingleTon s1=new SingleTon();
//        s1.message("gade ");
//        s1=SingleTon.getFillwater(); // here i can create no.of objects bcs within a class we can acsees no.og private single ton constructor
//
//
//    }


}
class c{
    public static void main(String[] args) {
        SingleTon s=SingleTon.getFillwater();
        s.message("nihal ");

       //SingleTon s1=new SingleTon(); // here we get error bcs private varibles we canot acsesss1.message("gade ");
        SingleTon s1=SingleTon.getFillwater();
        s1.message("vinay");
        System.out.println(s==s1);
    }
}
