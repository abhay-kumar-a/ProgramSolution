package practice;

import java.util.Scanner;

class P13 {
    public static int[] ArrayChallenge(int[] arr) {
        // code goes here
        int[] arr1 = new int[arr.length];

        arr1[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] <= arr[i]) {
                    arr1[i] = arr[j];
                    break;
                } else {
                    arr1[i] = -1;
                }
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);

//int[] arr ={2,4,5,1,7};
//System.out.println(Arrays.toString(arr));
//System.out.println(Arrays.toString(arr1));
        int[] a ={5, 3, 1, 9, 7, 3, 4, 1};
        int[] arr = ArrayChallenge(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
