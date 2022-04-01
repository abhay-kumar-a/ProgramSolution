package stringarray.newPragrams;

public class CopyString extends CountLengthOfString {
    public static void main(String[] args)  {
     CopyString s = new
             CopyString();
     s.copyString("Abhay");
    }
    void copyString(String str)
    {
       int length = lengthFind(str );
        char[] arr = str.toCharArray();
        char[] newArr = new char[length];
        String newString = "";
        int i = 0;
        while ( i!= length)
        {
            newArr[i] = arr[i];
            newString =newString+  newArr[i];
                    i++;
        }
        System.out.println("copy of string is : "+ newString);
    }

}
