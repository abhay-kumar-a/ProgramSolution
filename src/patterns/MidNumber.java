package patterns;

public class MidNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4,5, 7};
        int start  = 0;
        int end  = arr.length-1;
        int median = start+(end - start)/2;
        System.out.println("Median is : " + arr[median]);
    }
}
