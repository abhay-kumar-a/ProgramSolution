package newAssignments.tasks;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<Integer,String> phoneBook= new LinkedHashMap<>();

        phoneBook.put(986199990,"Ram Prasad");
        phoneBook.put(986199991,"Shyam");


        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter phoneNumber: ");
        try
        {
            Integer integer = sc.nextInt();
            if(phoneBook.containsKey(integer))
                {
                    System.out.println(phoneBook.get(integer));
                }
                else {
                    System.out.println("not found");
                }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid PhoneNumber format");
        }
    }

}

/*
Enter phoneNumber:
986199990
Ram Prasad

* */