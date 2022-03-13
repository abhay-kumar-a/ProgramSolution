package dsabootcamp.opps.generics;

public class GenericSolutionOFExample {
    public static void main(String[] args) {
        // for genetics class use wrapper class because in generic method we can pass only reference types not primitives
        Integer[] a = {4, 5, 6, 7};
        Float[] f = {3.4f, 56.9f, 76.2f, 56.6f};
        Character[] c = {'4', 'r', '5', 'y'};
        // calling printArray generic method
        printArray(a);
        System.out.println();
        printArray(f);
        System.out.println();
        printArray(c);
    }
   // A class that can refer to any type is known as a generic class.
    // Here, we are using the T type parameter to create the generic class of specific type.

   // Let's see a simple example to create and use the generic class.
    static <T> void printArray(T[] array)   // <> is called angle brackets , just  replace generic type of place of data type like see in method
    {
        for(int i= 0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
  //  The T type indicates that it can refer to any type (like String, Integer, and Employee).
//  The type you specify for the class will be used to store and retrieve the data.