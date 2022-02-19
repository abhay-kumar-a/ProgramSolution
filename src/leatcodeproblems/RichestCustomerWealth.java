package leatcodeproblems;
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i customer has in the j bank. Return the wealth that the richest customer has.
//
//        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//      Example 1:
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.
//        Example 2:
//
//        Input: accounts = [[1,5],[7,3],[3,5]]
//        Output: 10
//        Explanation:
//        1st customer has wealth = 6
//        2nd customer has wealth = 10
//        3rd customer has wealth = 8
//        The 2nd customer is the richest with a wealth of 10.
//        Example 3:
//
//        Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//        Output: 17

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] account = {{6,87,34},{1, 3, 2} , {3, 2, 1},{3,4,5},{45,5,6}};
        int wealth;
        int m= account.length;
        int[] allWealth = new int[m];
        System.out.print("All customer wealth are : ");
       for(int i = 0;i<m;i++)
       {
           int n = account[i].length;
           wealth=0;
           for (int j = 0 ; j<n;j++)
           {
                    wealth +=account[i][j];
           }
           // all accounts wealth store in allWealth array variable
           allWealth[i]=wealth;
       }
        System.out.println(Arrays.toString(allWealth));
       // Max wealth find...
        int MaxWealth=0;
        int position = 0;
        for(int i = 0 ;i<allWealth.length;i++)
        {
             MaxWealth=allWealth[0];
            if(allWealth[i]>MaxWealth)
            {
                MaxWealth=allWealth[i];
                position=i;
            }
        }
        System.out.println("MaxWealth is :  '"+MaxWealth + "' at position : "+position);

    }
}
