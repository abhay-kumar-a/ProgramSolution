package dsabootcamp.opps.inheritance;

public class PrimeNo {
    public static void main(String args[]){

        int n=3;//it is the number to be checked
        for(int i=1;i<=100;i++)
        {
            prime(i);
        }
        System.out.println('a'+"a");

    }
    static int prime(int n)
    {
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
//            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
//                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n); }
        }//end of else

        return n;
    }
}
