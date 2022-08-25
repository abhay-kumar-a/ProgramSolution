package java8.examles;

public class mini {
    public int  minimumAbsoluteSum(int N, int[]A)
    {
       int a =3;
       int b =7;
       int sum = 0;
       int sum2=0;
       for(int i =0;i<A.length;i++)
       {
           sum=sum+Math.abs(A[i]-a);
           if(b==A[i])
           {
               sum2=sum2+Math.abs(b-A[i]);
           }
       }
       int abs = Math.abs(a-b);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new mini().minimumAbsoluteSum(4, new int[]{2, 3, 6, 7}));
    }
}
