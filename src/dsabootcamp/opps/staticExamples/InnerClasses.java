package dsabootcamp.opps.staticExamples;  // package is nothing but container of classes
// Inner class means class inside in the class;
// Outside class , never will be in static and private , because java modifier don't allow it;
// statics members accessed via classes ,  also can access vis (this or ref) , but right convention is access via class



class B {  // Inner Class , How to use it;
    String name;

    B(String name) {
        this.name = name;
    }
}

// Points
// a class inside the class , must be in static for accessing its context or data members in different  class;
// if a class is static means it's all var,method will be static by default
// if class is not inner class , we easily access its context without making its static ,  by object(reference);
// by default any object return hexadecimal values by colling toString method ( we also can make our own toString Method)

//.....................case 1..............................
    public class InnerClasses {
      int a =7;
      static String newName = "Gulsion";
      A refOfA ;
        static class A {  // here class A depends on Inner class          // ..........rule1

            static String name; // static var means its value will be same for all objects ,  //.............. rule_2

            String name1;  // here if I declare name1 as simple variable means not use static // here point for understand is : name1 consider as static by default
                           // because class is static , but still he print different name(via objects(a , a1)(because depends on objects) why :
                          // class A is static ,does not depend on InnerClass(objects of InnerClass)... that is fine
            //              but these two 'A' and 'main',they can have instances of each other (so it will print different name for different objects)

            A(String name , String name1) {
                A.name = name;  //  static
                this.name1 = name1; //  non-static
            }

            //.................. rule_3....................
            // understanding toSting Method
//            @Override
//            public String toString() {
//                return  name1;
//
                public String toString()
                {
                    return name1;
                }

        }
        public static void main(String[] args) {
//            InnerClasses n = new InnerClasses();
            A a = new A("Abhay","Abhay"); //
            A a1 = new A("Vivek","Vivek");
            System.out.println(newName);
            InnerClasses innerClasses = new InnerClasses();
            innerClasses.refOfA= a;
            System.out.println("attach innerclass ref and A ref: "+ innerClasses.refOfA);
            System.out.println(innerClasses.a);

            // .................. rule_1 ...........

            System.out.println(A.name);  //  print "Vivek" , //  first constructor call  ,  name = Abhay , but in second constructor calls name will be == Vivek for both objects;
            System.out.println(A.name);  // print "Vivek"  //  This happens because name initialise as static,and static var cont depends on objects;

            //..................... rule_2 ...............

            System.out.println(a.name1); // print individual identities' means a.name1 = Abhay. a1.name= Vivek;
            System.out.println(a1.name1);
//            // for class B
//            B b = new B("Abhay");
//            B b1 = new B("Vivek");
//            System.out.println(b.name); // print  "Abhay"
//            System.out.println(b1.name); // print "Vivek" //  because non-static var are depends on objects;

        //.................rule_3......
            // toString
            System.out.println(a); // print = "Abhay" //  we did not have own toSting return value ; it will print some hexadecimal default values
                                     //return getClass().getName() + "@" + Integer.toHexString(hashCode());(in this format )
            System.out.println(a1);   // print = "Vivek"

            // if made own toSting method and return value ... like in rule_3;

        }
}
