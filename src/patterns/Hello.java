package patterns;

public class Hello {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k =i;k>=0;k--)
            {
                System.out.print((char)(k+65));
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                System.out.print(" ");
            }
            for (int k =n-i;k>=0;k--)
            {
                System.out.print((char)(k+65));
            }
            System.out.println();
        }
    }
}
