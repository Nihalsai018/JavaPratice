package intervivew;



public class fib {
    public static void main(String[] args) {
        int n=0;
        int m=1;
        int res=0;


        for (int i=1;i<=10;i++){
            res= res=n+m;
            n=m;
            m=res;

            System.out.println(res);

        }
    }








}
