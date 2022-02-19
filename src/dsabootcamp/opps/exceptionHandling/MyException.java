package dsabootcamp.opps.exceptionHandling;

public class MyException extends  Exception  {  // creating own exception
  MyException(String message)
  {
      super(message);
  }
}
