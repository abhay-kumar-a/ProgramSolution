package newAssignments.ass7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*2. Given the following data of students in <FirstName> <LastName><GroupId> <Age> pattern.
 Sara Mills 1 18
 Andrew Gibson 2 21
Craig Ellis 1 23
Steven Cole 2 19
Andrew Carter 2 2
Using stream api find the following,
        1. Print all students whose first name is before their last name lexicographically
2. Print all students from group number 2
3.  Find the eldest student
4. Create  an apt collection of students in such a way to have a pair of  first  name & age. The collection shall have student first names in ascending order.
        */
public class Question2 {
    public static void main(String[] args) {

        Students student1 = new Students("Abhay","Kumar",1,23);
        Students student2 = new Students("Manish","Kumar",2,24);
        Students student3 = new Students("Kajal","Sharma",2,21);
        Students student4 = new Students("Vijay","Shankar",6,22);

        List<Students> studentsList = Arrays.asList(student1,student2,student3,student4);
        //  1. Print all students whose first name is before their last name lexicographically
        List<Students> list12= studentsList.stream().filter(n1->n1.getFirstName().compareTo(n1.getLastName())<1).collect(Collectors.toList());
        list12.stream().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
       //   2. Print all students from group number 2
        studentsList.stream().filter(o1 -> o1.getGroupId()==2).forEach(System.out::println);

       //  3.  Find the eldest student
        System.out.println("-----------------------------------------------------");
        studentsList.stream().sorted((o2, o3) -> o3.getAge().compareTo(o2.getAge())).limit(1).forEach(System.out::println);

       //  4. Create  an apt collection of students in such a way to have a pair of  first name & age.
        //  The collection shall have student first names in ascending order.
        System.out.println("------------------------------------------------");

        studentsList.stream().sorted((o4,o5) -> o4.getFirstName().compareTo(o5.getFirstName())).
                map(o6 -> o6.getFirstName() + " "+ o6.getAge()).forEach(System.out::println);

    }

}

class Students {
    String firstName;
    String lastName;
    Integer groupId;
    Integer age ;

    public Students(String firstName, String lastName, Integer groupId, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupId=" + groupId +
                ", age=" + age +
                '}';
    }


}

