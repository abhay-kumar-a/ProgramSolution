package dsabootcamp.bitwiseoperators;

public class SingleNo {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,5,8,5,9,7,9,7};
        int n = appearingOnceNo(arr);
        System.out.println("\nUnique No is : " + n);
    }

    static int appearingOnceNo(int[] arr)
    {
        int result  = 0;
        for( int n :arr)
        {
            result = result^n;
            System.out.println(Integer.toBinaryString(result));
        }
        return result;
    }
}
