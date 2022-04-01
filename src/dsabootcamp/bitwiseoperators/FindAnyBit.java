package dsabootcamp.bitwiseoperators;

public class FindAnyBit {
    public static void main(String[] args) {
        int n = 23; // give number over here not  bit of that number....
        int result = getAnyBit(n, 4);
        System.out.println("Binary of no is : "+Integer.toBinaryString(n));
        System.out.println("Bit is : "+ result);

    }
    static  int getAnyBit(int n, int bit)
    {
        return (n & 1<<(bit-1)) >>(bit-1);  //
    }
}
