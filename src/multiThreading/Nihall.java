package multiThreading;
 public class Nihall {
       void display(int n){
           synchronized (this) {

               for (int i = 1; i <= 5; i++) {
                   System.out.println(n + i);

                   try {
                       Thread.sleep(10 * 100);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }

               }
           }

    }
}
class Aa extends Thread{

    Nihall n=new Nihall();
    public  void run() {

        n.display(5);
    }
}
class Bb extends Thread{
     Nihall n=new Nihall();
    public  void run() {

        n.display(100);
    }
    public static void main(String[] args) {

        Aa t1 = new Aa();



        Bb t2 = new Bb();

        t1.start();
        t2.start();


    }


}



//public class Nihall {
//    void display(int n){
//        synchronized(this) {
//            for (int i = 1; i <= 5; i++) {
//
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(n++);
//
//            }
//        }
//
//    }
//}
//class Aa extends Thread{
//    Nihall s;
//    public Aa(Nihall s) {
//        this.s=s;
//    }
//
//    @Override
//    public void run() {
//        s.display(5);
//    }
//
//
//}
//class Bb extends Thread{
//   Nihall k;
//    public Bb(Nihall k) {
//        this.k=k;
//    }
//    public  void run() {
//
//        k.display(100);
//    }
//
//    public static void main(String[] args) {
//        Nihall o=new Nihall();
//        Aa t1 = new Aa(o);
//        Bb t2 = new Bb(o);
//
//        t1.start();
//        t2.start();
//
//
//    }
//
//
//}
//
//
