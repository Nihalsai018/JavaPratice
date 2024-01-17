package projectsone;


public class Interviw {
    String s1;
    String[] s2;

    String method(String s){
        s1=s.substring(7,12);
        s2= s.split("#",5);

        System.out.println(s1+"substring");
        System.out.println(s2+"split");
        return s1;
    }
    public static void main(String[] args) {
        Interviw i= new Interviw();
       String sunOne =i.method("031625#04092-m+");
      String subTwo =i.method("031625#1304092-m+");


    }
}
