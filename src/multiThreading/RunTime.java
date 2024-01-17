package multiThreading;

public class RunTime {


    public static void main(String[] args)  {
        Runtime r=Runtime.getRuntime();
//        try {
//            Runtime.getRuntime().exec("notepad");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            Runtime.getRuntime().exec("shutdown -s -t 0"); to shutdowm with given time of 0 sec
//           Runtime.getRuntime().exec("shutdown -r -t 6"); restart after 6 sec
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(r.availableProcessors());

        for(int i=0;i<10000;i++){
            new RunTime();
        }
        System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: "+r.freeMemory());
    }
}





