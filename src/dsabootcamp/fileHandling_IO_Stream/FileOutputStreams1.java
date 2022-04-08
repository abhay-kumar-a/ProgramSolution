package dsabootcamp.fileHandling_IO_Stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileOutputStreams1 {
    public static void main(String[] args) {

        try{
            FileOutputStream f = new FileOutputStream("F:\\ImportantSubject\\FileInJava\\Abhay.txt");
//            for(int i =0 ;i<=257;i++) {
//                System.out.println(i);
//                f.write(i);
////                f.write(32);
//                // write method take byte and sing by as well as array byte. we can't pass any other data type over here.
//                /// here it converts automatic int into byte and store in java
//            }
            f.write(0);
            f.write(255);
            f.write(256);
            f.write(257);

            String s ="+ Hello my name is Abhay";
            byte[] b = s.getBytes();
//            f.write(b);
                System.out.println("byte are: " + Arrays.toString(b));
            /// add string in file
            f.close();
        }catch (IOException f  ){f.printStackTrace();}
    }

}
