package dsabootcamp.opps.interfaces.nested;

public interface A {
    public interface NestedInterface{  // interface inside interface
         boolean isOdd(int num);
    }
}
class B1 implements A, A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num &1)==1;
    }
}

// or interface inside the class
class NewClass{
    public  interface NestedInterface1{
        void Hello();
    }
   public void Hello()
    {
        System.out.println(" Hello i am in NewClass");
    }
}
class SubClass implements NewClass.NestedInterface1{
    public void Hello()
    {
        System.out.println("Hello I am Hello of subClass");
    }
}

