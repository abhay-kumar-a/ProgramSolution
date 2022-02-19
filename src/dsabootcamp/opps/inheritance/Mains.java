package dsabootcamp.opps.inheritance;

// Java program to count vowels in a string
public class Mains {

    // Function to check the Vowel
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }

    // Returns count of vowels in str
    static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) // Check for vowel
                ++count;
        return count;
    }

    // Driver code
    public static void main(String args[])
    {
        //string object
        String str = "bana";
        str = str.replaceAll("\\s","");
        System.out.println(str);
        // Total numbers of Vowel
        int vowels=countVowels(str);
        System.out.println(countVowels(str));
        int cons = str.length()-vowels;
        System.out.println(cons);
        // consonents

    }
}
// This code is contributed by Sumit Ghosh

