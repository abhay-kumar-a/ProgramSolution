package dsabootcamp.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists<I extends Number> {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        /// single array list
        ArrayList<Integer> arrayList = new ArrayList<>(5);  // here if we use object lin generic type then for use get() method , we need to type cast it as '(Integer) get()' like that
        System.out.println(arrayList);
        for(int i = 0; i<5;i++)
        {
            arrayList.add(i);
        }
        for(Integer num:arrayList)
        {
            System.out.println(arrayList.get( num)); // getMethod used
        }
        System.out.println(arrayList); /// automatic print in format [0,1,2,3,4]
        // for get element from array
        for(int j = 0 ;j<arrayList.size();j++)
        {
            System.out.println(arrayList.get(j));
        }


        // multiple arrayList
        ArrayList<ArrayList<Integer>> arrayList1 = new ArrayList(); // multiple arrayList created

        // initialise multiple arrayList
        for(int i = 0 ;i<3;i++)
        {
            arrayList1.add( new ArrayList(i));  // here give size of arrayList in is 3;
        }
        System.out.println("Multiple ArrayList size : " + arrayList1.size());
        System.out.println(arrayList1); // print [[] [] []]

        //  adding element in size;
        System.out.println("Enter Element of arrays ");
        for(int i = 0;i<3;i++) // here give NiceCar arrayList size
        {
            System.out.println("Enter element for "+i+ " Index : ");
            for(int j = 0;j<5;j++) // here give inside arrays size
            {
                // adding element
                arrayList1.get(i).add(sc.nextInt()); //  take fist [] by get() and add element by add()// it will continue 3 times
            }
        }
        System.out.println(arrayList1);
        // get arrays by arrays List
        for(int i = 0; i<arrayList1.size();i++)
        {
            System.out.println(arrayList1.get(i));
        }

        // also, can get single element from arrayList
        for(int i = 0; i<arrayList1.size();i++)
        {
            for(int j = 0;j<arrayList1.get(i).size();j++)
            {
                System.out.print(arrayList1.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}
