package dsabootcamp.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//  read  =  is take char and if redLine is use then pass remaining data as string of readLine

public class BufferReaders {
    public static void main(String[] args) throws IOException {
        ScannerMethod();
        BufferReaderMethod();
    }

    static  void BufferReaderMethod() throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter int value : ");
        int  i = Integer.parseInt(r.readLine());
        float f =Float.parseFloat(r.readLine());
        char c =  (char) r.read();
        System.out.println("Int is : "+  i + "Float is : "+ f + "char  is : " + c);
        System.out.println("Enter String value : ");
        String s = r.readLine();  // use for string input ;
        System.out.println("string is : "+ s);
    }

     static  void ScannerMethod()
    {
        Scanner  sc =  new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();   // always  use nextLine upper then all sequence ;
        System.out.println(" Enter char value");
        char c = sc.next().charAt(0);  //  why use 0 in char :  Returns the char value at the specified index. An index ranges from 0 to length() - 1.
        // The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
        System.out.println("Enter Integer Value: ");
        int  m = Integer.parseInt(sc.next());
        System.out.println("char is : "+ c + " String is of nextLine  : "+ s + " String of next is : "+ m);


    }
}
