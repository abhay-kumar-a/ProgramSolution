package dsabootcamp.bitwiseoperators;

public class ResetIthBit {
    public static void main(String[] args) {
        int num = 23;
        int ithBit=3;
        System.out.println("Binary is : "+ Integer.toBinaryString(num));
        System.out.println("Ans is : "+ resetIthBit(num,ithBit));
        System.out.println("Binary of ans is : "+ Integer.toBinaryString(resetIthBit(num,ithBit)));
    }
    static int resetIthBit(int num , int ithBit)
    {
        return num & ~(1<<(ithBit-1));
    }
}
