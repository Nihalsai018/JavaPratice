package intervivew;

public class TypeCasting {
    void display(){
        System.out.println("iam nihal in a");
    }

}
class Type extends TypeCasting {
    @Override
    void display() {
        System.out.println("iam in b");
    }

    void show(){
        System.out.println(" iam sai in b");
    }

}
class leader{
    public static void main(String[] args) {




        TypeCasting t3= new Type();
        t3.display();

        Type t4= (Type) t3;
        t4.display();
        t4.show();






    }
}
