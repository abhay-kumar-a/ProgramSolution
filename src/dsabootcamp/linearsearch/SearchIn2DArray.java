package dsabootcamp.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {2, 5, 8, 6}};
        int temp = 0;
        int row = 0;
        int column = 0;
        // max element in 2d array..
        int MAXElement = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > MAXElement) {
                    MAXElement = arr[i][j];
                }
            }
        }
        System.out.println("Max Element Is : " + MAXElement);
        int target = MAXElement;
     // find Any Target Element
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                   if (target == arr[i][j]) {
                    temp++;
                    System.out.println("Element " + target + " found at position : " + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        if (temp > 0) {
        } else {
            System.out.println("Not found");
        }

        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(" element "+target+" at position : " +Arrays.toString(ans));
        System.out.println(Integer.MIN_VALUE);

        //
        int[] position = search2(arr,4);  // also, can
        System.out.println(" element 4 at position : "+ Arrays.toString(position));

    }
    // same
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    // same
    static int[] search2(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
