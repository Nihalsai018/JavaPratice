package oops;

public class Overriding {
    class A{
        protected void msg(){System.out.println("Hello java");}
    }

    public class Simple extends A{
        public void msg(){System.out.println("Hello java");}//C.T.Error
        public void main(StringOne args[]){
            Simple obj=new Simple();
            obj.msg();
        }
    }
}
