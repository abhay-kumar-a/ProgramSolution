package dsabootcamp.collection.mapDatastructure;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String str = "     string  abhay     hello  dsf dfg ghh     " ;
        String str1 = "";
        int i =0;
        while( i != str.length())
        {
            if(str.charAt(i) != ' ')
            {
                str1 = str1+str.charAt(i);
            }
            i++;
        }
        System.out.println("String is : "+ str1);
        System.out.println(str);
        str = str.trim();
        str =str.replaceAll(" " ,"");
        System.out.println(str);
    }
}
