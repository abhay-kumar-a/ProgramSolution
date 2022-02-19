package practice;

public class PrimeNo {
    public static void main(String[] args) {
        int num = 95;


        for (int i = 1; i < 17; i++) {

            PrimeNo(i);
        }

    }

    public static void PrimeNo(int num) {
        if (num <= 1) {
            System.out.println(num + " --Not Prime");
        }
        int c = 2;
        int count = 1;
        while (c < num) {
            if(num<=1)
            {
                continue;
            }
            if (num % c == 0) {
                count++;
            }
            c = c + 1;

        }
        if (count > 1) {
            System.out.println(num + " -- Not Prime");
        } else {
            System.out.println(num + " -- Prime");
        }
    }
}
