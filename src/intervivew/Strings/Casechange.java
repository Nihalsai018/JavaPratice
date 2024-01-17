package intervivew.Strings;

public class Casechange {
    public static void main(String[] args) {
        String s="Nihal Sai";
        StringBuffer s1=new StringBuffer(s);

//
//       s= s.replace("\\s ","");
//        System.out.println(s);


        for (int i=0;i<s.length();i++){

            if(Character.isLowerCase(s.charAt(i))){
                s1.setCharAt(i,Character.toUpperCase(s.charAt(i)));

            }
            else if (Character.isUpperCase(s.charAt(i))){
                s1.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }


        }
        System.out.println(s1);







    }
}
