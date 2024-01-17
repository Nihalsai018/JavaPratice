package oops;

class  EncapuslationP  {
   private String name="sai";
    private String phonenumber="123456789";

    public EncapuslationP(){
        System.out.println("iam non parametrized ");
    }


   public EncapuslationP(String name ){ // on type of setter
        this.name=name;

    }


    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}

class display{
    public static void main(String[] args) {
        EncapuslationP s= new EncapuslationP("nihal");
        System.out.println(s.getPhonenumber()+"  " + s.getName());

        EncapuslationP s1=new EncapuslationP();

    }
}
