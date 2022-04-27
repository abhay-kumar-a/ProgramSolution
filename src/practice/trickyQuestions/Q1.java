package practice.trickyQuestions;

public class Q1 {
    public static void main(String[] args) {
        // print Hello world without using any semiColon in System.out.println() method
        if (System.out.printf("printf: Hello World\n") == null);
        {

        }
        if(System.out.format("format : Hello World\n") != null)
        {

        }
        if(System.out.append("append : Hello world\n") == null)
        {

        }

        for(int i = 0;i <1; System.out.println("for loop : Hello World"))
        {
            i++;
        }


    }



    static {
        System.out.println("Hi I am Abhay..");
    }

}
