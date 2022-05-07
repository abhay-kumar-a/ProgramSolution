package dsabootcamp.opps.exceptionHandling;

// keyword used in exception Handling
// try: the "try" keyword used to specify a block where we should place an exception code, we cont make try block alone , the try block must follow
 //    by either catch or finally
// Catch : the catch block is used to handle exception , we can't use catch block alone , try must be place at above
//  Finally : The final block is used to execute necessary block // it will whether an exception will occur, handle  or not
// throw: The throw keyword is used to throw an exception // itself , we can create out exception
// throws: The throws' keyword is used to declare  exception . it specifies that there may be occurred an exception , it always used with method signature ;
public class ExceptionHandling {
    // we can use multiple catch in try catch block  but , try and finally will be written only one times  // also can use nested try catch block;

    public static void main(String[] args) throws Exception {
        int a = 5;int b = 0;
//        int c= a/b;
//        System.out.println(c); /// so Arithmetic exception

        try {
            // code that may throw and exception;
//            int c= a/b;
//            System.out.println(c);
            String name = "Abhay";
            if(name.equals("Abhay"))
            {
                throw  new MyException("yes, name is Abhay");
            }
        }
        // add our own Exception
        catch (MyException e)
        {
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e)  // Exception class have already Arithmetic subclass // it handles the Arithmetic exception and show as output
        {//
            System.out.println(e.getMessage());
        }
        catch (Exception e)   // here it will show an error :Exception 'java.lang.ArithmeticException' has already been caught in Exception class(if 1 catch will be here and Exception will be above)
                                            // so more restrictive class will be above than less restrictive classes;
        {
            System.out.println("Normal Exception "+e.getMessage()); // /by zero // written in good manner// e.getMessage will get "yes, name is Abhay" from MyException
        }

        finally {  // optional
            System.out.println("It always be executed , no matter exception will occur or not , Execute necessary code ");
        }

        int b1=9;
        System.out.println( divide(a,b));

    }
    // creating static method
    static int divide(int a , int b) throws Exception {
        if(b==0)
        {
            throw  new ArithmeticException("please do not divide by zero");  /// for use of throw , need to attach throws Exception  with method signature
                                                                                // self created exception on;
        }
        return a/b;
    }
}
