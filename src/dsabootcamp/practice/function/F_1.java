package dsabootcamp.practice.function;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class F_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How much Money you want to convert  ");
        System.out.println(" 1. Indian : /n 2.  USD :");
        int select = sc.nextInt();
        System.out.println("Enter Amount : ");
        double userInput = sc.nextDouble();

        if(select == 1)
        {
            System.out.format("USD : %.2f" ,  userInput / 75.05);
        }
        else if(select==2)
        {
            System.out.format("INDIAN : %.2f" , userInput * 75.05);
        }
        else {
            System.out.println("Error Input");
        }


    }
}
