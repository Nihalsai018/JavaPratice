package collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    int rollNumber;
    String name ;
    int age;


    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1=new Student(1,"nihal",22);
        Student s2=new Student(2,"gade",23);
        Student s3=new Student(3,"sai",21);
        ArrayList <Student> school =new ArrayList<>();
        school.add(s1);
        school.add(s2);
        school.add(s3);
        Iterator its = school.iterator();
        while(its.hasNext()){
           Student st1=(Student)its.next();
            System.out.println(st1.rollNumber+" "+ st1.name +" "+st1.age);
        }
//        for(Student st:school){
//            System.out.println("rollnumber:- "+st.rollNumber+" Name:-  "+st.name+" Age:- "+st.age );
//        }


//        System.out.println("\nUsing regular for loop:");
//        for (int i = 0; i < school.size(); i++) {
//            Student student = school.get(i);
//            System.out.println(student.rollNumber + " " + student.name + " " + student.age);
//        }


    }
}
