/*
package collections;

public class DateOfBirthCompator {

//    class FamilyMember implements Comparable<FamilyMember> {
//        private String name;
//        private int age;
//        private Date dateOfBirth;
//
//        public FamilyMember(String name, int age, Date dateOfBirth) {
//            this.name = name;
//            this.age = age;
//            this.dateOfBirth = dateOfBirth;
//        }
//
//        public String getName() {
            return name;
        }

//        public int getAge() {
//            return age;
//        }
//
//        public Date getDateOfBirth() {
//            return dateOfBirth;
//        }
//
//        @Override
//        public int compareTo(FamilyMember other) {
//            // Compare family members based on age
//            return Integer.compare(this.age, other.age);
//        }
//
//        public static void main(String[] args) {
//            ArrayList<FamilyMember> familyMembers = new ArrayList<>();
//
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//            try {
//                Date dob1 = dateFormat.parse("1978-06-15");
//                Date dob2 = dateFormat.parse("1999-03-21");
//                Date dob3 = dateFormat.parse("2001-12-05");
//                Date dob4 = dateFormat.parse("1974-08-30");
//
//                familyMembers.add(new FamilyMember("Veena", 45, dob1));
//                familyMembers.add(new FamilyMember("Nikhil", 24, dob2));
//                familyMembers.add(new FamilyMember("Nihal", 22, dob3));
//                familyMembers.add(new FamilyMember("Srinivas", 47, dob4));
//
//                // Sort family members by age using natural ordering (Comparable)
//                Collections.sort(familyMembers);
//
//                System.out.println("Sorting by Age:");
//                for (FamilyMember member : familyMembers) {
//                    System.out.println("Age: " + member.getAge() + ", Name: " + member.getName() + ", DOB: " + dateFormat.format(member.getDateOfBirth()));
//                }
//
//                // Using a custom Comparator to sort by date of birth
//                Comparator<FamilyMember> dobComparator = Comparator.comparing(FamilyMember::getDateOfBirth);
//                Collections.sort(familyMembers, dobComparator);
//
//                System.out.println("Sorting by Date of Birth:");
//                for (FamilyMember member : familyMembers) {
//                    System.out.println("Age: " + member.getAge() + ", Name: " + member.getName() + ", DOB: " + dateFormat.format(member.getDateOfBirth()));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
*/
