package oops;

 interface Father {
    void father();

}
 interface Mother{
    void father();
}

class child implements Father, Mother{
    @Override
    public void father() {
        System.out.println("he is the father of child");
    }



    public static void main(StringOne[] args) {
        child c=new child();
        c.father();
    }
}
