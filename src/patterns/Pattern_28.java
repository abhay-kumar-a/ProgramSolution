package patterns;

public class Pattern_28 {
    public static void main(String[] args) {
        int n =5 ;
        pattern(n);
    }
    static void pattern(int n)
    {
        for(int row = 1; row<2*n;row ++)
        {
            int totalColumns = row>n ? 2*n-row : row;
            int noOfSpaces = n-totalColumns;
            for (int s = 1; s<=noOfSpaces;s++)
            {
                System.out.print(" ");
            }
            for (int col = 1 ; col<=totalColumns ;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *
