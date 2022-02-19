package dsabootcamp.linearsearch;

public class FindAnyElement {

    public static void main(String[] args) {
        int arr[] = {4,6,8,4,6,5};
        int target = 1;
        System.out.println(target + " element find at position "+ find(arr,target));

    }
    static int find(int [] arr,int target)
    {
        for(int i= 0;i<arr.length;i++)
        {
            if(target==arr[i]) {
                return i;
            }
        }
        return -1;   // -1 means element not find at any position
    }
}

