package dsabootcamp.introductionToProgramming;
// Type conversion and range;
public class TypeConversion {
    public static void main(String[] args) {
//        System.out.println(args[0]);
        int i =262;
        byte b = (byte)i;  // b = 262%256(range of byte)  then got 6;

        System.out.println(b);
        int bytes = Byte.SIZE;
        System.out.println("Size of byte : "+ bytes+" bits");
        System.out.println("Range of byte is : "+ Math.pow(2,bytes));
        int a= Integer.SIZE;  // give the size in byte;
        System.out.println("int size in byte : " + a/8);
        System.out.println("int size : "+ a +"bits");
        System.out.println("Range of int is : "+ Math.pow(2,a));

        // power of any number

    }
}
