package patterns;
public class StringCount {
    public static void main(String[] args) {
        String s = "llllllllllapple";
        String given = "apple";
        int l = given.length();
        int S_Length = s.length();
        int count = 0;
        int nextCount  = 0;
        if(S_Length%l==0)
        {
            for(int i = 0;i<=s.length()-1;i=i+l)
            {
                count=0;
                for(int j = 0;j<=given.length()-1;j++)
                {
                    if(given.charAt(j) == s.charAt(j+i))
                    {
                        count++;
                    }
                    else {
                        continue;
                    }
                }
                if(count==l)
                {
                    nextCount++;
                }
            }
            System.out.println(nextCount);
        }
        else {
            System.out.println("Error");
        }
    }
}
