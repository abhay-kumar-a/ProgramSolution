package patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        int n = 5;
        Pattern5(n);
    }
    static void Pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColumnsAre = row > n ? 2 * n - row  : row; // ternary operator used here
            for (int col = 1; col <= totalColumnsAre; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

// also, can use if else statements
//static void Pattern5(int n) {
//    for (int row = 1; row < 2 * n; row++) {
//        if(row>0 && row<=n)
//        {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//        }
//        else {
//            for (int col = 1; col <= 2*n -row; col++) {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//    }
//}