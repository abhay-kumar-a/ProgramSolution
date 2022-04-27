package practice;


class A {
    A() {
        System.out.println("A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("B");
    }
}

 public class Problem1 extends B{
    Problem1()
    {
        System.out.println("C");
    }

     public static void main(String[] args) {
         Problem1 p = new Problem1();
     }
}
// Output
//ABC
