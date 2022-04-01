package dsabootcamp.recursion.questions;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(getProductOfDigits(1235));
    }
    static int getProductOfDigits(int n)
    {
        if (n%10==n)      // return that last value as it is;
        {
            return n;
        }
        return n%10 * getProductOfDigits(n/10);

    }
}
