package dsabootcamp.practice;

import org.w3c.dom.Text;

import java.util.Arrays;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
//        StringBuilderMethod();
//        timeCheck();
        stringBufferMethod();
    }

        static void StringBuilderMethod() {
            StringBuilder b = new StringBuilder(new String("JElodlk"));   /// class
            StringBuilder b2= new StringBuilder();
            b.append(" " + 34);
            b.append(" " + 332);
            System.out.println(b);
            String b1 = b + "";
            System.out.println("ref b value is : " + b1);
            String[] a1 = b1.split(" ");
            System.out.println("print is array : " + Arrays.toString(a1));

            String s = new String(new StringBuilder("Hello"));                 /// class
            for (int i = 0; i < 5; i++) {
                s = s + " abhay";
            }
            System.out.println(s);

            String[] a = s.split(" ");
            System.out.println(Arrays.toString(a));
            System.out.println(a[0]);
            String sa = "Hello abhay abhay abhay abhay abhay";
            String[] s1 = sa.split(" ");
            System.out.println(Arrays.toString(s1));
        }
    static void stringBufferMethod()
            {
                StringBuffer b = new StringBuffer();
                b.append("ZeroIndex : ");
                b.append(342+ "\n");
                b.append("NumberFirst : ").append(34+"\n");
                b.append("NumberSecond : ").append(345);
                System.out.println(b);
                String s1 = b+"Abhay";
                String[] ar = s1.split(" ");
                System.out.println("Array is : ");
                for (int i = 0;i<ar.length;i++)
                {
                    System.out.println(ar[i]);
                }
                System.out.println(ar[1]);
//                System.out.println(Arrays.toString(ar) + "Abhay");

            }


    static void timeCheck(){
        /// time check
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        String s12 = "";
        for(int i = 0;i<10000;i++)
        {
            s12= s12+"Hello";
        }
        long TimeTakenByString = System.currentTimeMillis() - currentTime;
        System.out.println("TimeTakenByString : " + TimeTakenByString);

        long currentTimeStringBuilder = System.currentTimeMillis();
        System.out.println(currentTimeStringBuilder);
        StringBuilder b = new StringBuilder();
        for (int i = 0;i<10000;i++)
        {
            b.append("Hello");
        }
        long TimeTakenByStringBuilder =  System.currentTimeMillis() - currentTimeStringBuilder ;
        System.out.println("TimeTakenByString : " + TimeTakenByStringBuilder);

    }
}

// output
// string Builder
/*JElodlk 34 332
        ref b value is : JElodlk 34 332
        print is array : [JElodlk, 34, 332]
        Hello abhay abhay abhay abhay abhay
        [Hello, abhay, abhay, abhay, abhay, abhay]
        Hello
        [Hello, abhay, abhay, abhay, abhay, abhay] */
// String Buffer
/*ZeroIndex : 342
        NumberFirst : 34
        NumberSecond : 345Hello*/
