package dsabootcamp.bitwiseoperators;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int a = 768687;
        if((a & 1)==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
