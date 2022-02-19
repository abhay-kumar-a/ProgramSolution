package dsabootcamp.practice;

public class FindLengthThroughIndices {
    public static void main(String[] args) {
        int[] arr ={2,4,5,6,7,7,9};
        int startIndices =2 ;
        int endIndices  =4;
        System.out.println(arr[startIndices]);
        System.out.println(arr[endIndices]);
        int length =  endIndices-(startIndices-1);
        System.out.println("Length : "+length);
    }
}
