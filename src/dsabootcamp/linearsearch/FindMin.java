package dsabootcamp.linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int arr[] = {-9,2,1,8,0,7,-4,7};
        int MinElement  = arr[0];
        for(int  i = 0;i< arr.length;i++)
        {
            if(arr[i]<MinElement)
            {
                MinElement = arr[i];
            }
        }
        int position=0;
        for (int i = 0;i<arr.length;i++)
        {
            if(MinElement==arr[i])
            {
                position=i;
            }
        }
        System.out.println("Min element : "+ MinElement+"\nIndex position : "+ position);
    }
}
