package patterns;

public class Pattern_32 {
    public static void main(String[] args) {
        int n =5 ;
        pattern(n);
    }

     static void pattern(int n) {
        int m = 2*n ;
        for (int row = 0 ; row <= m ;row++)
        {
            for (int col = 0 ; col <= m ; col++)
            {
                int digitOfEveryIndex = n - Math.min(Math.min(row, col) , Math.min(m -row , m -col));
                System.out.print(digitOfEveryIndex + "  ");
            }
            System.out.println();
        }
    }
}

