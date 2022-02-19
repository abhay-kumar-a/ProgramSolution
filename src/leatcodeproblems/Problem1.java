package leatcodeproblems;
//Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        ThereFore, only 12 and 7896 contain an even number of digits.
//        Example 2:
//        Input: nums = [555,901,482,1771]
//        Output: 1
//        Explanation:
//        Only 1771 contains an even number of digits.

public class Problem1 {
    public static void main(String[] args) {
        int temp = 0;
        int evenCount=0;int oddCount=0;
        int[] arr = {12, 345, 2, 6, 7896,4,6,5};
        System.out.print("Count digit of all element : ");
        for (int j : arr) {
            temp = 0;
            int a = j;
            while (a > 0) {
                a = a / 10;
                temp++;
            }
            System.out.print(temp + " ");

            if (temp % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("Even digits : "+evenCount);
        System.out.println("Odd digits :"+oddCount);
    }
}
