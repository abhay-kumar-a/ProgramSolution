package Linearsearch;

public class MinimumElementInArray {
    public static void main(String[] args) {
        int[] n = { 2,3,4,6,6,-1,4,7};
        int ans = n[0];
        for (int i = 1; i<n.length;i++)
        {
            if(n[i]<ans)
            {
                ans = n[i];
            }
        }
        System.out.println(ans);
    }
}
