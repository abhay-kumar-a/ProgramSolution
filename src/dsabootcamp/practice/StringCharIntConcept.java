package dsabootcamp.practice;

public class StringCharIntConcept {
    public static void main(String[] args) {
        int a = 1234;
        String str= String.valueOf(a); /// for convert integer into String use, String.valueOf()
        int a1 =Integer.parseInt(str); // convert string to int;
        System.out.println(a1);
        int  i =0;
        int sum=0;
        while (i !=str.length())
        {
            sum = sum+Integer.parseInt(String.valueOf(str.charAt(i)));   // for convert chat to string if they are in number
                                                                          // 1.  convert chat to string by String.valueOf(char or int) , then convert string to int;
            i++;
        }
        System.out.println(sum);
    }
}
