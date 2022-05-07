package dsabootcamp.opps.cloningObjects;

public class Employee  implements  Cloneable{
    int id ;
    String name ;
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

    @Override
    public Employee clone() throws  CloneNotSupportedException {
       // try {
            Employee clone = (Employee) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
    }
}
