package dsabootcamp.multithrading;

class A
{
    void Hello(int a)
    {
        System.out.println("Hey, I am Hello of A..");
        // print doc..
        for(int i = 1;i<=a;i++)
        {
            System.out.println("!!!This is doc "+i + " of A");
            // we also can some time slice to run on that particular time..
            // by using thread static method sleep..
            try{
                Thread.sleep(1000);} catch (Exception e){}   // Thread.sleep always use in try catch  method... here 1000millis = 1second
                                                                 // by suse of this it prints !!!this is doc 1 and wait 1 sec the print 2 . it will be continued every time
        }
    }
}
class B
{
    void Hello(int a)
    {
        System.out.println("Hey , I am Hello of B..");
        for (int i =1;i<=a;i++)
        {
            System.out.println("@@@ This is doc"+ i + " of B");
            // give some time slice to run..
            try {Thread.sleep(1000);} catch(Exception e){}
        }
    }
}

public class NewExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.Hello(5);
        b.Hello(5);

    }
}
