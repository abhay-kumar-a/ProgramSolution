package dsabootcamp.opps.polymorphism;

public class Numbers {
    Numbers(int a,int b)
    {
        System.out.println(a+b+1);
    }
    Numbers(double a,double b)
    {
        System.out.println(a+b);
    }
    int sum(int a, int b, int c)
    {
        return a+b+c;
    }



    public static void main(String[] args) {
        Numbers n = new Numbers(2,3); // it will call Number(int) parameter
        //  if numbers(int) parameters not give , then it will call double type parameter
        // java convert automatic type conversion of int to double
        // it happens only in lower to Higher type conversion //  means  "byte,short,int, float, double,long" like this
     int a=n.sum(3,4,5);// method
        System.out.println(a);
    }
}
