package intervivew;



import static java.lang.Integer.parseInt;

public class Hey {
    public static void main(String[] args){

        //-----------------varible , datatypes, casting

//        long i=256;
//        System.out.println(i);
//         double f= i; // widing
//        System.out.println(f);
//
//         int j= (int) f; //narworing
//        System.out.println(j);
//
//        float g= (float) f; //overflow
//        System.out.println(g);
//
//        byte b= (byte) i; // over flow
//        System.out.println(b);
//
//        byte s= (byte) 128;
//        System.out.println(s);
//
//        String s1=new String("nihal");
//       // String s1=new String("nihal");
//        String s2="nihal";

        //---------------------terarany opertor
//        System.out.println("enter the number to check whether  it is even or odd");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String s= n%2==0 ? "even ": "odd";
//        System.out.println("your number is "+s);


        //------------------------switch
//        System.out.println("Enter the day in the week");
//        Scanner sc=new Scanner(System.in);
//
//        String day=sc.next();

// old procedure to do
//        switch (day){
//            case "saturday" , "sunday" :
//                System.out.println("ring alarm at 9:30 am");
//                break;
//            case "monday"  :
//                System.out.println("ring alram at 8 am");
//                break;
//            default:
//                System.out.println("ring alram at 8 30 am");
//        }

        // new process to do without break

//        switch (day){
//            case "saturday" , "sunday" -> System.out.println("ring alarm at 9:30 am");
//
//            case "monday"  -> System.out.println("ring alram at 8 am");
//
//            case "tuesday", "wensday","thursday","friday"  -> System.out.println("ring alram at 8 am");
//
//            default -> System.out.println("Sorry , Pleae Enter the day of Week and case Sestive Enter a number in lower case");
//        }


        // for loop and while loop
//
//        int i=1;
//
//        while (i<6){
//            System.out.println(i+"hello");
//            for (int j=1;j<=i;j++){
//                System.out.println(j+"-----nihal");
//            }
//            i++;
//        }


        for (int i=1 ;i<=5;i++){
            System.out.println("----Day :- "+i +"----");
            System.out.println("enter you Thime sheet in Below hours");
            for (int j=10; j<=18 ;j++){

                System.out.println(j +"-"+ (j+1) + ":-");

                int s = 123;

                String ii = String.valueOf(parseInt("23"));

                System.out.println(i); // 123



            }

        }









    }
}
