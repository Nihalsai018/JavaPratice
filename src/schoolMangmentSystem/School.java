package schoolMangmentSystem;
import java.util.List;
public class School {

    private List<Teacher>  teachers;
    private List<Student> students;
    private static int totalmoneyearned;
    private static int totalmoneyspent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalmoneyearned=0;
        totalmoneyspent=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalmoneyearned() {
        return totalmoneyearned;
    }

    public  static void updateTotalMoneyEarned(int moneyearned) {
        totalmoneyearned+=moneyearned;

    }

    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    public static void updateTotalmoneyspent(int moneyspent) {
        totalmoneyspent-=moneyspent;
    }

}
