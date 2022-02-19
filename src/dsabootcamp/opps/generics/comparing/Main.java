package dsabootcamp.opps.generics.comparing;

import javax.lang.model.type.MirroredTypeException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Students abhay = new Students(88.5f,2);
        Students vivek = new Students(77.56f,30);// here java will be confused which variable you want to compare ,you have two instance variable, marks and rollNumber,
        Students vineet = new Students(80.4f,27);// so for solve these problems we use generic comparable interface;
        Students rajan  = new Students(70.67f,18);
        Students ankit = new Students(72.56f,5);
        // Example first :
//        if(abhay.compareTo(vivek)==0)
//        {
//            System.out.println("Both are equal");
//        }
//        else if(abhay.compareTo(vivek)>0)  // syntax for use of comparable method ;
//        {
//            System.out.println("Actually diff value : "+ abhay.compareTo(vivek));  // it will not print   exact value
//            System.out.println("Abhay have more marks than vivek");
//
//        }
//        else {
//            System.out.println("Vivek have more marks");
//        }

        // Example Second:
        Students[] students = {abhay,vivek,vineet,rajan,ankit};
//        System.out.println(students[0]);
        System.out.println("Actual values : "+Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("Sorted values according marks : "+ Arrays.toString(students)); // sort according marks // why , because in i pass marks in compareTo method// if I remove compare method
                                                        // it will confuse and give error;  cannot be cast to class java.lang.Comparable


        // also, can pass  Comparator  parameter in sort method
        Arrays.sort(students, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
//                System.out.println("check again and again");
                return (int)( o1.rollNumber-o2.rollNumber);  // return in accenting order
                //                 return -(int)(o1.rollNumber-o2.rollNumber);  // return in descending order because I pass minus(-)
            }
        });
        System.out.println("Using inside Comparator parameter by rollNumber : "+Arrays.toString(students));
        // by using lambda function :  it is in line function or one line function
        Arrays.sort(students, (o1, o2) -> {
             return (int)( o1.rollNumber-o2.rollNumber);  // return in accenting order
             //                 return -(int)(o1.rollNumber-o2.rollNumber);  // return in descending order because I pass minus(-)
         });
        System.out.println("Sort According roll Number by lambda function :"+Arrays.toString(students));



    }

}
