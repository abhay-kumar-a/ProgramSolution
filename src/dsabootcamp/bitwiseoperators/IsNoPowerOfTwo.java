package dsabootcamp.bitwiseoperators;

public class IsNoPowerOfTwo {
    public static void main(String[] args) {
        int n = 04;
        checkPowerOfTwo(n);
        checkPowerOfTwo1(n);
        // can use boolean as well
         if(n==0)
         {
             System.out.println("Not");
         }
         else {
             boolean ans = (n&(n-1))==0;
             System.out.println(ans);
         }

    }
    static  void  checkPowerOfTwo(int n)
    {
       int count = 0 ;
       while (n>0)
       {
           if((n&1)==1)
           {
               count++;
           }
           n = n>>1;
       }
        System.out.println("Count of 1 is : "+count);
       if(count==1)
       {
           System.out.println("Yes");
       }
       else {
           System.out.println("Not");
       }
    }
    static  void  checkPowerOfTwo1(int n)
    {
        if(n==0)
        {
            System.out.println("No");
        }
        else {
            if((n&(n-1))==0)
            {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

    }

}
