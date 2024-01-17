package intervivew;



public class ToString {
    String color;
    String size;

    ToString(String c, String s) {
        color=c;
        size=s;

    }

    public String toString() {//overriding the toString() method
        return "my pen Color is " + color + " and it is " + size + " in size"; // used to convert the object to string
    }

    public static void main(String[] args) {
        ToString t = new ToString("blue", "small");
        ToString t1=new ToString("black","big");




        System.out.println("my pen Color is "+t.color +" and it is "+t.size +" in size");// disadvanatge is for every object i have to write the string
        System.out.println("my pen Color is "+t1.color +" and it is "+t1.size +" in size");// disadvanatge is for every object i have to write the string



        System.out.println(t); // one time reuse many times one string in to string
        System.out.println(t1);
    }
}