package dsabootcamp.linearsearch;
// Input: accounts = [[1,2,3],[3,2,1]]
//         Output: 6
//         Explanation:
//         1st customer has wealth = 1 + 2 + 3 = 6
//         2nd customer has wealth = 3 + 2 + 1 = 6
//         Both customers are considered the richest with a wealth of 6 each, so return 6.

public class MaxWealth {
    public static void main(String[] args) {
   int[] [] arr = {{1,2,3},{3,2,1},{5,7,5,4}};
   int ManWealth =MaxWealthFind(arr);
        System.out.println(ManWealth);
    }
    static int MaxWealthFind(int[][]arr)
    {
        int MaxWealth = 0;
        int[] countElement= new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            int count = 0;
            for(int j = 0;j<arr[i].length;j++)
            {
                count = count+arr[i][j];
            }
            countElement[i]=count;
            //m find max value;
            MaxWealth=countElement[i];
            if(countElement[i]>MaxWealth)
            {
                MaxWealth=countElement[i];
            }
        }

        return MaxWealth;
    }
}
