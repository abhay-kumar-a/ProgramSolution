package patterns;

public class Pattern_31 {
    public static void main(String[] args) {
        int n =4;
        pattern(n);
    }
    static void pattern(int n)
    {
        int m = 2*n;
        for(int row = 0; row <= m ;row++)
        {
            for(int col = 0 ; col<=m ; col++)
            {
                int digitEveryIndex = Math.min( Math.min(row , col) , Math.min(m - col , m -row));
                System.out.print(digitEveryIndex+ " ");
            }
            System.out.println();
        }
    }
}
//        0 0 0 0 0 0 0 0 0
//        0 1 1 1 1 1 1 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 3 4 3 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 1 1 1 1 1 1 0
//        0 0 0 0 0 0 0 0 0

