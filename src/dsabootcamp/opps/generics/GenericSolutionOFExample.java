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
    static <T> void printArray(T[] array)   // <> is called angle brackets , just  replace generic type of place of data type like see in method
    {
        for(int i= 0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
