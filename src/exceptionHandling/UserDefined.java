package exceptionHandling;

public class UserDefined extends  Exception{
    public UserDefined(String s){
        System.out.println("nihal mssg");

    }
}

 class a {
     public static void main(String[] args) {
         try{
             if (10>0){
                 throw new UserDefined("nihal");
             }

         }
         catch (UserDefined s){
             System.out.println(s.getMessage());
         }



     }

}
