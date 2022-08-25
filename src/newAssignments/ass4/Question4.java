package newAssignments.ass4;

import java.io.*;
import java.util.*;


/*\
i. Create a text file in a new folder and few paragraphs
ii. check if a file or directory has read and write permission
iii. revoke all permissions over the file
iv. grant all permissions over the file
v. print last modified time of a file
vi. print file size in bytes, kb, mb
vii. store text file content line by line into an array
viii. find the longest word in a text file
* */
public class Question4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\NewOne\\TextFile.txt");

        System.out.println(file.exists());

        //  ii. check if a file or directory has read and write permission
        if (file.exists()) {
            System.out.println("Executable : " + file.canExecute());
            System.out.println("Readable : " + file.canRead());
            System.out.println("Writeable : " + file.canWrite());
        } else {
            System.out.println("File not found");
        }
        System.out.println("------------------------------------------------------------------------------");
//       // iii. revoke all permissions over the file
//        if(file.exists())
//        {
//            System.out.println(file.canExecute());
//            System.out.println(file.canRead());
//            System.out.println(file.canWrite());
//        }

        System.out.println("-------------------------------------------------------------------------------");
        //grant all permissions over the file

        if (file.exists()) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
        }

//        FileWriter fileWriter =new FileWriter(file);
//     //   fileWriter.write("Hello I am Abhay Kumar");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("Hello I am abhay kumar");
//        bufferedWriter.close();

        System.out.println("------------------------------------------------------------------");
        // v. print last modified time of a file
        long lastModify = file.lastModified();
        Date data = new Date(lastModify);
        System.out.println("lastModified date : " + data);

        //vi. print file size in bytes, kb, mb
        System.out.println("-----------------------------------------------------------");
        System.out.println(file.length());
        if (file.exists()) {
            System.out.println("File Size : ");
            System.out.println("in Bytes : " + file.length() + "bytes");
            System.out.println("in Kb : " + (double) file.length() / 1024 + "kb");
            System.out.printf("in MB  : %.05fmb", (double) file.length() / (1024 * 1024));
            System.out.println("");
        }


        System.out.println("-----------------------------------------------------------");
        // vii. store text file content line by line into an array
        StringBuilder stringBuilder = new StringBuilder();
        String check = "";
        List<String> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (check != null) {
                check = bufferedReader.readLine();
                stringBuilder.append(check);
                stringBuilder.append(System.lineSeparator());
                check = bufferedReader.readLine();
                if (check == null) {
                    break;
                }
                list.add(check);
            }
            System.out.println(Arrays.toString(list.toArray()));
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException exception) {
            System.out.println("Unable to read file.");
        }
        System.out.println("----------------------------------------------------------------------------");
        //viii. find the longest word in a text file

        FileReader fileReader = new FileReader(file);
        Scanner sc = new Scanner(fileReader);
        String longest = "";
        String word;
        while (sc.hasNext())
        {
           word=sc.next();
            System.out.println(word);

            if(word.length() >longest.length())
            {
                longest =word;
            }
        }
        System.out.println("\n longest_word is : "+ longest);



    }
}
