package oops;

class Polymorpisham {
    void fuel(){
        System.out.println("vechile use fuel as petrol and disel");
    }

    void vechile(){
        System.out.println("vechile have  wheels");
    }
}
class Bike extends Polymorpisham {
    void vechile(){
        System.out.println("it is bike");
    }
    void speed(){
        System.out.println("range speed is upto 100KMPH");
    }


}


class  Car extends Polymorpisham{
    void vechile(){
        System.out.println("it is car");
    }
    void speed(){
        System.out.println("range speed is up to 300KMPH");
    }
}

class vechile{
    void display( Polymorpisham p){
        p.fuel();
        p.vechile();
    }
}
class Main{
    public static void main(StringOne[] args) {
        Bike b=new Bike();
        Car c=new Car();

//        b.fuel();
//        b.vechile();
//        b.speed();
//        c.fuel();
//        c.vechile();
//        c.speed();

        // here we can acess all the methdos but 2 operations 2 refences like b,c has vechile vechile but seprate opratons
        //in vechiles to make this iam chnaing 1 refence 2 operations by using   loose coupling


//        Polymorpisham p;
//        p=b;
//        p.vechile();
//       // p.speed(); // errror because we cannot acsses special methods directly , bcs in polymorpishm class there is bo spped method
//        ((Bike)(p)).speed(); // now we can acess special methos

//        p=c;
//        p.vechile();
//      //  p.speed(); //error
//        ((Car)(p)).speed(); // now we can acess special methos
//

        // here we can c one refrence p two operations but special methods are not acesssing so to acsses special methos aslo
        //we are down casting parent ref to child objects

        // now all probles are okay but one dis code is length to reduce that  special method is ctreted

        vechile v=new vechile();
        System.out.println("...................................................................");
        v.display(b);
        b.speed();
        System.out.println("...................................................................");
        v.display(c);
        c.speed();
        System.out.println("...................................................................");






    }
}