package projects.library_management_system;

import java.util.Scanner;

public class Library {
    static String bookName,bookIssueDate , bookReturnDate;
    static int bookId ,totalBookIssued;

    // create method for add books details ;
    void addBook()
    {
        System.out.println("Enter book name : ");
        // create object
        Scanner obj1 =  new Scanner(System.in);
        String bookName = obj1.nextLine();
        System.out.println("Enter price : ");
        float price = obj1.nextFloat();
        System.out.println("Enter book Number : ");
        int bookNo = obj1.nextInt();
        System.out.println("Books details are :  " + bookName + " "+ price+ " "+ bookNo);
    }

    // creating book issue method :
    void issueBook()
    {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Book name : ");
        bookName=obj2.nextLine();
        System.out.println("Book_id : ");
        bookId = obj2.nextInt();
        obj2.nextLine();  // for break the line
        System.out.println("issue date : ");
        bookIssueDate=obj2.nextLine();
        System.out.println("total number of book issued : ");
        totalBookIssued = obj2.nextInt();
        obj2.nextLine();
        System.out.println("Return book date: ");
        bookReturnDate = obj2.nextLine();
    }

    // getter function to get Id;
    int getBookId()
    {
        return bookId;
    }

    void returnBook()
    {
        System.out.println("Enter Student name  & book_id :");
        Scanner ob3 = new Scanner(System.in);
        String bookReturnName = ob3.nextLine();
        int bookRId = ob3.nextInt();

        // apply condition to conform book id ;
        if(bookRId ==  bookId)
        {
            System.out.println("Total Details : ");
            System.out.println("Book Name : "+ Library.bookName);
            System.out.println("Book id : "+ Library.bookId);
            System.out.println("issue date : "+ Library.bookIssueDate);
            System.out.println("total number of book Issue : "+ Library.totalBookIssued);
            System.out.println("Book Return date : "+  Library.bookReturnDate);
        }
        else {
            System.out.println("wrong id , please enter correct id: ");
        }


    }
    void detail()
    {
        System.out.println("Book Name : "+ Library.bookName);
        System.out.println("Book id : "+ Library.bookId);
        System.out.println("issue date : "+ Library.bookIssueDate);
        System.out.println("total number of book Issue : "+ Library.totalBookIssued);
        System.out.println("Book Return date : "+  Library.bookReturnDate);
    }

    void exit()
    {
        System.exit(0);
    }
}
