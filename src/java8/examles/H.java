package java8.examles;
public class H {
    public int solution(int[] A)
    {
        int max=A[0];
        for(int i=0; i<A.length;i++)
        {
            if(A[i]%3==0 && max<A[i])
            {
                max=A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {-6,-91,100, 84, -22, 0, 1, 473,1011};
        System.out.println(new H().solution(A));
    }
}
