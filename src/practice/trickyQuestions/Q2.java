package practice.trickyQuestions;

public class Q2 {
    public static void main(String[] args) {
        Integer i1 = 7;  // it will do autoBoxing whit Integer cache range
        Integer i2 = 7;
        System.out.println(i1 == i2); // false // in integer cache memory Integer start with  -128 to 127 ( for between these value it will give true nighter it will give false)

        Integer s1 = -128;
        Integer s2 = -128;
        System.out.println(s1 == s2);  // return true

        int a = 128;
        int b = 128;
        System.out.println(a == b);  // true


        System.out.println("Integer Reference is : ");
        Integer a1 = new Integer(7);
        Integer a2 = new Integer(7);
        System.out.println(a1==a2);  // false





        A a3 = new A(5);
        System.out.println( "A is : "+ a3.val);
    }
}

    class A
    {
        int val ;
        A(int val)
        {
            this.val = val;
        }
    }
