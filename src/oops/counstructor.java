package oops;
class counstructor {
    private StringOne name;
    private int id;
    public static StringOne branch;

    public long number;

    public int num;

    public counstructor() {
//        name ="nihal";
//        id=07;
//        branch="products";

    }
    public counstructor(StringOne name){
        this();
       this.name=name;

    }
    public  counstructor(StringOne name, int id, StringOne branch , long phonenumber){

        this(name);
        //this.name=name; // it prints as per user gave by object

    }


    public StringOne getName() {
        return name;
    }

    public void setName(StringOne name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringOne getBranch() {
        return branch;
    }

    public void setBranch(StringOne branch) {
        this.branch = branch;
    }

    public static void main(StringOne[] args) {

//       counstructor c1=new counstructor("nihalsai",9,"products",950504498);
//       counstructor c2=new counstructor("kanna");git
//       counstructor c3=new counstructor();
//        System.out.println(c1.getName());



    }
}
