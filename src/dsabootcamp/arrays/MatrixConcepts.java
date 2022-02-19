package dsabootcamp.arrays;

import java.util.Arrays;

public class MatrixConcepts {
    public static void main(String[] args) {
        int[][] arr = {{3,4,56,7},   // given matrix initially
                       {2,4,56,2},
                       {7,8,6}};

        //  length of matrix
        System.out.println(arr.length); //  length = no. of row in array // so answer  is 3;
        // length of all rows in side the matrix
//        for(int  i = 0;i<arr.length;i++)
//        {
//            System.out.println(arr[i].length);
//        }
        System.out.println(Arrays.toString(arr));  // give default hexadecimal values for all objects
        for( int[] i : arr) { // for each loop

            System.out.print(Arrays.toString(i) + " length is: ");  // print is String format
            System.out.println(i.length);  //  give length
        }
 //

        // now time to access all single elements present in the array //  it will be possible by using 2 for loop
        //  1 for row and second for column;
        System.out.println("By using normal for loop get element from array");
        for(int row = 0; row<arr.length;row++)
        {
            for(int column =0 ;column<arr[row].length;column++)
            {
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }

        System.out.println("By using for each loop get element from array");
        for (int[] row : arr) {             // by  using for each loop
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
