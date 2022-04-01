package stringarray.newPragrams;

import java.util.Locale;

public class CountVowelsConsonantsAndSpecialSymbols {
    public static void main(String[] args) {
        String str ="abhay KUmar'Bhai";
        int vowels= 0;
        int consonants=0;
        int specialSymbol=0;
        str = str.toLowerCase();

        int  i =0;
        char[] c =str.toCharArray();
        while (i!= c.length)
        {
            if(c[i] >=97 && c[i]<=122)
            {
                if(c[i] == 'a' || c[i] == 'e' ||c[i]=='i' || c[i] == 'o' || c[i] =='u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
            else {
                specialSymbol++;
            }
            i++;
        }
        System.out.println("String is : "+ str);
        System.out.println("Total count  is : "+ (vowels+consonants+specialSymbol));
        System.out.println("Vowels : "+ vowels);
        System.out.println("Consonants : "+ consonants);
        System.out.println("Special Symbols : "+ specialSymbol);
    }
}
