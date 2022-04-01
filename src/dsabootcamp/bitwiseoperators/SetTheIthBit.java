package dsabootcamp.bitwiseoperators;

public class SetTheIthBit {
    public static void main(String[] args) {
        int num = 23;
        int ithBit=4;
        System.out.println("Binary is : "+ Integer.toBinaryString(num));
        System.out.println("Ans is : "+ setIthBit(num,ithBit));
        System.out.println("Binary of ans is : "+ Integer.toBinaryString(setIthBit(num,ithBit)));
    }
    static int setIthBit(int num , int ithBit)
    {
        return num | 1<<(ithBit-1);
    }
}
