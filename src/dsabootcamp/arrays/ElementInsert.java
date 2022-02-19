package dsabootcamp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementInsert {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
         int[] arr ={4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
//        arr[1]=453; // for update array
//        System.out.println(Arrays.toString(arr));
//         int a = AddElementAtAnyPosition(arr);
//        System.out.println(a);
        deleteElement(arr);
    }
    static int AddElementAtAnyPosition(int[] arr){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Index : ");
        int index = sc.nextInt();
        System.out.println("Value : ");
        int value = sc.nextInt();
        int[] newArray= new int[arr.length+1];
        if(index<=arr.length) {
            for (int i = 0; i < newArray.length; i++) {
                if (i < index) {
                    newArray[i] = arr[i];
                } else if (i == index) {
                    newArray[index] = value;
                } else {
                    newArray[i] = arr[i - 1];
                }

            }
            System.out.println(Arrays.toString(newArray));
            return 0;
        }
        else{
            return -1;
        }
    }

    static void deleteElement(int[] arr)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Index : ");
        int index = sc.nextInt();
        int[] newArray = new int[arr.length-1];
        for(int i = 0;i<newArray.length;i++)
        {
            if(i<index)
            {
                newArray[i]=arr[i];
            }
            else {
                newArray[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
