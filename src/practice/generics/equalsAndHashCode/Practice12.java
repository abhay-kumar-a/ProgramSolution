package practice.generics.equalsAndHashCode;

public class Practice12 {
    int s =9;
    String name ;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    public String setName(String str)
    {
        return str;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Abhay");
        e1.setId(1);

        Employee e2 = new Employee();
        e2.setName("Abhay");
        e2.setId(1);
        Employee e3 = e1;
        Employee e4 = e2;


        // how to compare two object if they are hold same values.
        // see here
        //System.out.println(e1.equals(e2));  // it will return false even both object hold same value when we did not override the equals' method.
        // how to solve , for this we need to override equals method and give its own implementation.
        // after override equals method
        System.out.println(e1.equals(e2));  // true
        System.out.println(e1==e2); // false
        System.out.println(e3 == e4); // false

       // ------------------------------------------//
        // compare with same object;
        System.out.println("----------------compare with same object ----------------------------------------");
        System.out.println(e1.equals(e2));  // true
        System.out.println("-----------------------------------");


        // if first object hold null,so it will throw null pointer exception
        Employee e5= new Employee();
        Employee e6 = new Employee();
        e5.setName(null);
        e5.setId(3);
        e6.setName("Vivek");
        e6.setId(3);
//        System.out.println ("Hold null value : "+(e5.equals(e6)));  // throw :  NullPointerException: Cannot invoke "String.equals(Object)" because "this.name" is null

        // after apply condition in equal method of null
        System.out.println("For null value : ");
        System.out.println(e5.equals(e6)); // false

        // is it will compare different class object
        System.out.print("Get class name by using method getClass from object class : ");
        System.out.println(e5.getClass()); // return class name
        // if you want to try compare one class object to another class object , so it will return false , comparison only possible within the class
        Practice12 p = new Practice12(); // another class
        p.setS(3);
        p.setName("Vivek");
        boolean b = e6.equals(p);
//        System.out.println("one class to another class objects comparison: "+ b); //throw :Exception in thread "main" java.lang.ClassCastException
        // so try to fix it ;after fix it
        System.out.println("one class to another class objects comparison: "+ b); // true;







        // here hashCode and equals method are override from Object class . means Super class or parent class
        // So object class equals method always compare object according reference not values ...
        // but is String equals method object are compare according actual values or content.
        // hashCode always generate unique int value for object  , but it can also be same for two object like in String

        /// Owe created object . like e1, e2;  // both object e1 and e2 are different.
//        System.out.println(e1); // return some hashCode(hexDecimal) format
//        System.out.println(e2);//  return some hashCode(hexDecimal) format
//        System.out.println(e1.equals(e2)); // false     so it will return false
//        System.out.println(e1==e2);  // false
//        System.out.println(e1.hashCode()); // unique Number
//        System.out.println(e2.hashCode()); // also unique.
//
//        System.out.println("---------------");
//        // now we store name in String , so equals  and hashCode method Overridden from String own implementation
//        String s3 =e1.getName();
//        String s4 = e2.getName();
//        System.out.println("String : " + (s3.equals(s4)));  // true
//        System.out.println(s3==s4); // true
//        System.out.println(s3.hashCode()); // 63051455
//        System.out.println(s4.hashCode()); // 63051455
//
//        System.out.println(" ------------------------------------- ");
//
//        /// work with String with equals hashCode methods
//        String d ="Abhay";
//        String b="Abhay";
//        System.out.println(d.hashCode());  // same
//        System.out.println(b.hashCode()); // same
//        String s = new String("Abhay");  //
//        String s1 = new String("Abhay");
//        String s6 ="9";
//        int s5 = Integer.hashCode(Integer.parseInt(s6));
//        System.out.println("+++++++++++++++++++++++++++++++ + "+ s5);
//        System.out.println();
//        System.out.println(s.hashCode());  // same
//        System.out.println(s1.hashCode()); // same
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(b.equals(s1)); // true
//        System.out.println(d==b); // false
//        System.out.println(d==s1); // false
//
//        //Wrapper classes
//
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Wrapper classes ...............");
//        Integer i  = new Integer(5);  // internally its i also behave like integer me "5" is like  integer 5;
//        Integer i1= new Integer(5);
//        Integer i2 = 4;
//        Integer  i3 = 4;
//        System.out.println(i2==i3); // true
//        System.out.println(i==i1); //false
//        System.out.println(i.equals(i1)); // true
//
//        // hashCode()
//        // wrapper class hashCode not return random unique value  like string and own objects
//        // it returns the exact value which we pass in  wrapper classes.
//        System.out.println("HashCode of wrapper classes");
//        System.out.println(i.hashCode());  //
//        System.out.println(i1.hashCode());
//        System.out.println(i2.hashCode());
//        System.out.println(i3.hashCode());




    }
}
