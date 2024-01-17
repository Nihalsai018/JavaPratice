package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FamilyMember {
    private String name;
    private int age;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class AgeComparator implements Comparator<FamilyMember> {
    @Override
    public int compare(FamilyMember member1, FamilyMember member2) {
        // Compare family members based on age
        return Integer.compare(member1.getAge(), member2.getAge());
    }
}

class NameComparator implements Comparator<FamilyMember> {
    @Override
    public int compare(FamilyMember member1, FamilyMember member2) {
        // Compare family members based on name
        return member1.getName().compareTo(member2.getName());
    }
}

public class FamilyComparator{
    public static void main(String[] args) {
        ArrayList<FamilyMember> familyMembers = new ArrayList<>();

        familyMembers.add(new FamilyMember("Veena", 45));
        familyMembers.add(new FamilyMember("Nikhil", 24));
        familyMembers.add(new FamilyMember("Nihal", 22));
        familyMembers.add(new FamilyMember("Srinivas", 47));

        // Corrected: Create instances of AgeComparator and NameComparator
        AgeComparator ageComparator = new AgeComparator();
        NameComparator nameComparator = new NameComparator();

        // Sort family members by age using the ageComparator
        Collections.sort(familyMembers, ageComparator);

        System.out.println("Sorting by Age:");
        for (FamilyMember member : familyMembers) {
            System.out.println("Age: " + member.getAge() + ", Name: " + member.getName());
        }

        // Sort family members by name using the nameComparator
        Collections.sort(familyMembers, nameComparator);

        System.out.println("Sorting by Name:");
        for (FamilyMember member : familyMembers) {
            System.out.println("Age: " + member.getAge() + ", Name: " + member.getName());
        }

        // Find the family member with the maximum and minimum age
        FamilyMember maxAgeMember = Collections.max(familyMembers, ageComparator);
        FamilyMember minAgeMember = Collections.min(familyMembers, ageComparator);

        System.out.println("The oldest family member is: " + maxAgeMember.getName() + " (" + maxAgeMember.getAge() + " years old)");
        System.out.println("The youngest family member is: " + minAgeMember.getName() + " (" + minAgeMember.getAge() + " years old)");
    }
}
