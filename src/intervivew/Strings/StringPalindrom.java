package intervivew.Strings;

public class StringPalindrom {
    public static void main(String[] args) {
        String s="loal";
        String s1 ="";
        for (int i=s.length()-1 ;i>=0;i--){

          s1 += String.valueOf(s.charAt(i));

        }
        System.out.println(s1);




        if (s.equals(s1)){
            System.out.println("yes both are same");
        }
        else{
            System.out.println("both are not same");
        }
    }

}
