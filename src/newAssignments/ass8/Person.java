package newAssignments.ass8;

public class Person {
    String name ;
    Integer group;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Person(String name, Integer group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }


}
