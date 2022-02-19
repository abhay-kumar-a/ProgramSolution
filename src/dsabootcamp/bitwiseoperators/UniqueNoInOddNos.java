package dsabootcamp.bitwiseoperators;

public class UniqueNoInOddNos {
    public static void main(String[] args) {
        int[] arr = {2,3,2,2,7,7,8,7,8,8};
        for(int i: arr)
        {
            System.out.println( i+ " --  " + Integer.toBinaryString(i));
        }

    }
}
