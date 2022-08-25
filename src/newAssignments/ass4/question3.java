package newAssignments.ass4;

import java.util.Scanner;

public class question3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter password : ");
            String s = sc.nextLine();
            checkPassword(s);
        }
        public static void checkPassword(String str){

            if(str.length()<10){
                System.out.println("Invalid Password Digits");
            }
            else{
                String strUp = str.toUpperCase();
                char ch[] = strUp.toCharArray();
                int countAlpha=0;
                int countDigit=0;
                int specialChar=0;
                for(int i=0;i<ch.length;i++){
                    if(ch[i]>='A' && ch[i]<='Z'){
                        countAlpha++;
                    }
                    else if(ch[i]>='0' && ch[i]<='9'){
                        countDigit++;
                    }
                    else{
                        specialChar++;
                    }
                }
                if(countDigit>=2 && specialChar==0){
                    System.out.println("valid password");
                }
                else{
                    System.out.println("Invalid password");
                }
            }
    }

}
