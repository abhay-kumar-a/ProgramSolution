package practice;

class A1 {
        A1() {
        System.out.println("A");
        }
        }
class B1 extends A
{
    B1()
    {
        System.out.println("B");
    }
    void Hello()
    {
        System.out.println("Hey I am Hello");
    }
}

public class Problem2 extends B1 {
    Problem2() {
        System.out.println("C");
    }
    void Hii()
    {
        System.out.println("Hey I am Hii..");
    }

    public static void main(String[] args) {
        Problem2 p = null;
        p.Hello();  // print null pointer exception

    }
}