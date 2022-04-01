package dsabootcamp.bitwiseoperators;

public class SingleNo {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,5,8,5,9,7,9,7};
        int n = appearingOnceNo(arr);
        System.out.println("\nUnique No is : " + n);

        int a = 4 ^ 6;
        System.out.println("Binary Value :  "+ Integer.toBinaryString(4));
        System.out.println("Xor of Number is : "+ a);
    }
    static int appearingOnceNo(int[] arr)
    {
        int result  = 0;  // a ^ 0 = a; so use zero for grt number......
        for( int n :arr)
        {
            result = result^n;  ///
            System.out.println(Integer.toBinaryString(result));
        }
        return result;
    }
}
