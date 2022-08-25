package java8.examles;


import java.util.Arrays;

public class Hello {
    public int  Solution(int[] A)
    {
        Arrays.sort(A);
          int count =0;
          int maxValue=0;
          int len =A.length;
          int[] arr=new int[A.length];
          for(int i=0;i<A.length;i++)
          {
              for(int j=0,k=0;j<A.length-i;j++,k++)
              {
                  arr[k] = A[j];
              }
              maxValue=max(arr);
              if(maxValue%3==0)
              {
                  count++;
              }
          }
          if (count>1)
          {
              return maxValue;
          }
          else return -1;


    }
    public static int max(int[] a)
    {
        int max = a[0];
        for(int i =1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        int[] a={-6,-91,100, 84, -22, 0, 1, 473};
        System.out.println(h.Solution(a));

    }


}
