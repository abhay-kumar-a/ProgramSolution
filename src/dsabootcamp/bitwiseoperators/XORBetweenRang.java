package dsabootcamp.bitwiseoperators;

public class XORBetweenRang {
    public static void main(String[] args) {
        // Xor Of number
        // range between 3 and 9;
        int a = 3;
        int b = 9;
//        //xor of num(0 to 9)
//        int  m = xorOfNumbers(3);
//        System.out.println(m);

        // xor between range
        int ans = xorOfNumbers(b)^xorOfNumbers(a-1);
        System.out.println(ans);

//        // only use for check
//        int ans1=0;
//        for (int i= a ; i<= b ;i++)
//        {
//            ans1 = ans1^i;
//        }
//        System.out.println(ans1);
    }

    static int xorOfNumbers(int n) {
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
        return 0;  // for n%4==3;
    }
}
