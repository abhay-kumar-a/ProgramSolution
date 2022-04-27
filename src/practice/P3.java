package practice;

class Hello {
    int a = 5;
    Hello h = new Hello();
}

public class P3 {
    public static void main(String[] args)
    {
        Hello h = new Hello();
        System.out.println(h.a);
    }
}
// return StackOverFlow exception
