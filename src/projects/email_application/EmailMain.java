package projects.email_application;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class EmailMain {

    private String firstName;
    private String  lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength =10;
    private  String alternateEmail;
    private String companySuffix = "vsgoi.com";

    // Constructor to receive first name and lastName;
    public EmailMain(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName= lastName;
    //    System.out.println("Email Created: "+ this.firstName +  " "+ this.lastName);

        // call a method asking for the department -  return the department:
        this.department =setDepartment();
     //  System.out.println("Department: "+ this.department);

       // Call a method that return a random password;
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is : "+ this.password);

        // Combine elements to generate emil
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+ companySuffix;
      //  System.out.println("Your email is : "+ email);

    }

    // Ask for department
    private String setDepartment() {
        System.out.println("New worker: " + firstName + "\nDepartment Code\n1. for Sales\n2. for Development\n3. for Accounting\n0. for none\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
            if (depChoice == 1) {
                return "sales";
            } else if (depChoice == 2) {
                return "dev";
            } else if (depChoice == 3) {
                return "acct";
            } else {
                return "";
            }
    }

    // Generate a random password
    private String randomPassword(int length)
    {
        String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int  i=0; i<length;i++)
        {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // use setter getter get and update data;

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }

    // set the alternate email.
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail=altEmail;  // not show any ambiguity
    }
    // Change the password;
    public void changePassword(String password)
    {
        this.password =password;
    }
    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }
    public String getAlternateEmail()
    {
        return alternateEmail;
    }
    public String getPassword()
    {
        return password;
    }
    public String showInfo()
    {
        return "DISPLAY NAME: "+ firstName+ " "+ lastName+ "\nCOMPANY EMAIL: "+ email+ "\nMAILBOX CAPACITY: "+ mailboxCapacity+"mb";
    }
}
