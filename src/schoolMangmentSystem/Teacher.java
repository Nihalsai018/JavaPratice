package schoolMangmentSystem;

public class Teacher {


    private int id;
    private   String name;
    private int  salary;

    private static   int salaryenred;

    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryenred=0;
    }

    public int getId() {
         return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  void recivesalaray(int salary){
        salaryenred+=salary;
        School.updateTotalmoneyspent(salary);


    }
    public String toString(){
        return "Name of techer "+ name +" sarlary erened "+ salaryenred;
    }





}

