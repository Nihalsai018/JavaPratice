package oops;

public class StringOne {

    public String name;

    public StringOne(String name){
        this.name=name;
    }

    public void count(){
        int count=0;
        for (int i=0;i<name.length();i++){
            char c=name.charAt(i);
           if (Character.isUpperCase(c)){
                count++;
           }

        }
        System.out.println(count);

    }


    public static void main(String[] args) {
        StringOne s=new StringOne("NiHabbL");
        s.count();
    }

}

