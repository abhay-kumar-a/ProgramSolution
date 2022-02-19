package patterns;

public class PatternOne {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ;i<=n;i+=2){
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
