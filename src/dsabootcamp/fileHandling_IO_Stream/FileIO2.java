package dsabootcamp.fileHandling_IO_Stream;

import java.io.*;

public class FileIO2 {
    public static void main(String[] args) {
getAndSetFileIO();
    }

    static void getAndSetFileIO()
    {
        File f = new File("F:\\ImportantSubject\\FileInJava\\Hello.txt");
        File f1 = new File("F:\\ImportantSubject\\FileInJava\\Hi.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;


        // pass the file into fileInputStream and fileOutputStream..
        try{fileInputStream = new FileInputStream(f);    //   it is used to read file from local disk...
            fileOutputStream = new FileOutputStream(f1);  // we can make file anywhere by fileOutputStream..
        }catch(
                FileNotFoundException e){e.printStackTrace();}
        //
        // check how many bits are present in file which we are going to read. file all bits ....
        try{ System.out.println("All bits present in file : "+ fileInputStream.available());}catch (Exception r){r.printStackTrace();}

        // read data from fileInputStream

        try{
            int i =0;
            while((i = fileInputStream.read()) != -1)
            {
                fileOutputStream.write(i);
            }
        }catch (IOException e){e.printStackTrace();}

        // always try to close the file
        try{ if(fileInputStream != null)
        { fileInputStream.close();}}catch (IOException e){e.printStackTrace();}
        try{if(fileOutputStream != null){fileOutputStream.close();}}catch (IOException e){e.printStackTrace();}
    }
}
