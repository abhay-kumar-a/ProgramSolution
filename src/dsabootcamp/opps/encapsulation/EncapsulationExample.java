package dsabootcamp.opps.encapsulation;

// Encapsulation :  it is the concepts of oops
// Encapsulation in java is a mechanism ,of wrapping the implementation of data members and method in a class or a single units
// it is also known as data hiding,  in encapsulation , member or data or field or variable of class will be hidden from another class  and only can be accessed using
// getter and setter method, ThereFore also known as data hiding
//
// how to achieve Encapsulation : Declare  variable of class as private and provide getter , setter method for view and modify them ;

public class EncapsulationExample {
// make dataFields and private
    private String name  = "Abhay";
    private int rollNumber = 12;
    private  int age =22;
//    String getName1 = "Hello";

  //  getter method
   public String getName()
    {
        return name;
    }
    public  int getRollNumber()
    {
        return rollNumber;
    }
    public  int getAge()
    {
        return age;
    }

    //  setter method
    public  void setName(String name)
    {
        this.name = name;
    }
    public  void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

}
class  Main{
    public static void main(String[] args) {
        EncapsulationExample s = new EncapsulationExample();
//        System.out.println(s.name);
//        Main m   = new Main();
//        System.out.println(m.getName1);

        // access  encapsulation class dataMembers  using method
        // call getter method
        System.out.println("name: "+ s.getName() + " rollNumber : "+ s.getRollNumber()+ " age: "+ s.getAge());

        // going to set values of encapsulation method using setter method
        s.setName("Vivek");
        s.setRollNumber(3);
        s.setAge(23);
        // print
        System.out.println("\n"+ "After update values : \n"+ "name : "+ s.getName()+ " rollNumber : "+ s.getRollNumber()+ " age : "+ s.getAge() );


    }
}
