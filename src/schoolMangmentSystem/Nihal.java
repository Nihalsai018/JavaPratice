package schoolMangmentSystem;

import java.util.ArrayList;
import java.util.List;

public class Nihal {
    public static void main(String[] args) {
        Teacher radika=new Teacher(01,"Radika",500);
        Teacher vaishu=new Teacher(02,"Vaish",600);
        Teacher Tillu=new Teacher(03,"Tillu",650);

        List<Teacher> teacherList=new ArrayList<Teacher>();
        teacherList.add(radika);
        teacherList.add(vaishu);
        teacherList.add(Tillu);

        Student raju=new Student(01,"raju",7);
        Student rani=new Student(02,"Rani",5);
        Student mani=new Student(03,"Mani",2);

        List<Student> studentList=new ArrayList<Student>();
        studentList.add(raju);
        studentList.add(rani);
        studentList.add(mani);


        School kerala =new School(teacherList,studentList);

        //----students are paying fees to school


        rani.payfees(1000);
        System.out.println( "rani is paying fee to school :- "+kerala.getTotalmoneyearned());
        raju.payfees(3000);
        System.out.println("raju is paying fee to school:- "+kerala.getTotalmoneyearned() );

        //---paying salary to techers
        Tillu.recivesalaray(Tillu.getSalary());
        System.out.println("kerala has spent for salary"+Tillu.getName()+"and now has "+kerala.getTotalmoneyearned());
        radika.recivesalaray(radika.getSalary());
        System.out.println("kerala has spent for salary"+radika.getName()+"and now has "+kerala.getTotalmoneyearned());
        System.out.println(raju);
        System.out.println(radika);




    }
}
