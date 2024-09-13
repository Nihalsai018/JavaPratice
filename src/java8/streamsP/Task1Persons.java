package java8.streamsP;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1Persons {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Character gender;
    private int age;


    @Override
    public String toString() {
        return "Task1Persons{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public Task1Persons(String name, Character gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public static void main(String[] args) {
        List<Task1Persons> personsList = Arrays.asList(new Task1Persons("nihal",'m',23),
                new Task1Persons("vani",'f',24),
                new Task1Persons("veena",'f',22),
                new Task1Persons("abhi",'m',18),
                new Task1Persons("sai",'m',16));

//        personsList.stream().forEach(System.out::println);
//
//        System.out.println("-------------------Age greaterthan 18 by Filter");
//
//           personsList.stream().filter(i->i.age>18).forEach(System.out::println);
//
//        personsList.stream().filter(i->i.age>18).forEach(i-> System.out.println(i))

//        List<Task1Persons> ageGT18 = personsList.stream().filter(i->i.age>18).collect(Collectors.toList()); // age >18
//        System.out.println(ageGT18)


//        System.out.println("--------------Sort the age asec and desc");


//        personsList.stream().sorted(Comparator.comparing(Task1Persons::getAge).thenComparing(Task1Persons::getAge))
//                .forEach(System.out::println);

//       personsList.stream().sorted(Comparator.comparing(Task1Persons::getAge)).forEach(System.out::println);  //asc oder
//        personsList.stream().sorted(Comparator.comparing(Task1Persons::getAge).reversed()).forEach(System.out::println); //desc order
//
//        System.out.println("---------------get list of name who have gender  femle");
//
//        personsList.stream().filter(i->i.gender.equals('f')).map(i->i.name).collect(Collectors.toList()).forEach(System.out::println);
//
//        List<String> femaleList =personsList.stream().filter(i->i.gender.equals('f')).map(i->i.name).collect(Collectors.toList());
//        System.out.println(femaleList);

//        System.out.println("=---------find the oldest person "in the list and print their name.");
//
//
//        System.out.println(personsList.stream().sorted(Comparator.comparing(Task1Persons::getAge).reversed()).map(i->i.name).findFirst());
//
//       String name= String.valueOf(personsList.stream().sorted(Comparator.comparing(Task1Persons::getAge).reversed()).map(i->i.name).findFirst());
//        System.out.println(name);

//        System.out.println("----------Count\n" + "how many people are in the list who are younger than 30");
//
//        System.out.println( personsList.stream().filter(i->i.age<30).count());
//
//        Long count=personsList.stream().filter(i->i.age<30).count();
//        System.out.println(count);

//        System.out.println("----------name starts with V");
//
//       List<String> names= personsList.stream().filter(i->i.name.startsWith("v")).map(i->i.name).collect(Collectors.toList());
//        System.out.println(names);


    }


}
