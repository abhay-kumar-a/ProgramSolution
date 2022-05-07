package practice.generics.equalsAndHashCode;

import java.util.Objects;

public class Employee {

    private int id ;
    private String name;

    Employee()
    {

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        return id;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this.name==null)
        {
            return false;
        }
        if(this.getClass() != o.getClass())
        {
            return false;
        }

        // Create Employee object
        Employee otherObject= (Employee)o;
        if(this.name.equals(otherObject.name))
        {
            if(this.id == otherObject.id)
            {
                return true;
            }

        }
        return false;
    }
    // override equals method
//    public boolean equals(Employee otherObject)
//    {
//        if(this.name == null)
//        {
//            return false;
//        }
//        if(this.name.equals(otherObject.name))
//        {
//            if(this.id == otherObject.id)
//            {
//                return true;
//            }
//        }
//        return false;
//     }

    public String toString()
    {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && name.equals(employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

}
