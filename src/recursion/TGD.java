package recursion;

class TGD
{
    public static void main(String[] args) {
        int arr[] = new int[]{4,1,2,1,1,2};
        int arr1[] = new int[]{3,6,3,3};
        findSwapValues(arr,arr1);


    }
    static void findSwapValues(int[] Array1 , int[] Array2)
    {
        int sum1 = getSum(Array1);
        int sum2 = getSum(Array2);
        int v1=0;
        int v2 =0;
        for(int i = 0;i<Array1.length;i++)
        {
            for (int j = 0 ; j <Array2.length; j++)
            {
                int newSum1= sum1+Array2[j]-Array1[i];
                int newSum2 = sum2+Array1[i] - Array2[j];

                if(newSum1==newSum2){
                    v1 = Array1[i];
                    v2 = Array2[j];
                }
            }

        }
        System.out.println(v1 +","+v2);

    }
    static int getSum(int[] arr)
    {
        int sum = 0 ;
        for(int i = 0 ; i< arr.length ; i++)
        {
            sum+= arr[i];
        }
        return sum;
    }
}