package newAssignments.exception;

class MyException1 extends Exception {
    String message;
    MyException1()
    {
       super();
    }
    MyException1(String message)
    {
        super(message);
    }
}

class MyCass
{
    public static void main(String[] args) throws MyException1 {
        try {
           int a=10/0;

        }
        catch (Exception e)
        {
           throw new MyException1("Don't divide by zero");
        }
    }
}
