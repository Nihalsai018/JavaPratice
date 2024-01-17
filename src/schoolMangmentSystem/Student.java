package schoolMangmentSystem;

/**
 * here we are creating the small oops project
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private static int feespaid;
    private int totalfee;

    public Student(int id,String name,int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feespaid=0;
        this.totalfee=30000; // this is not mandentroy
    }

    public void payfees(int fee) {
        feespaid+=fee;// iam update the fee how much he paid
        School.updateTotalMoneyEarned(feespaid);

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

    public int getGrade() {
        return grade;
    }

    public static int getFeepaid() {
        return feespaid;
    }

    public static void setFeepaid(int feepaid) {
        Student.feespaid = feepaid;
    }

    public int getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(int totalfee) {
        this.totalfee = totalfee;
    }

    public int getremainFee(){
        return totalfee-feespaid;
    }
    public String toString(){
        return " student name "+name+" total fee paid by him "+ feespaid;

    }


}
