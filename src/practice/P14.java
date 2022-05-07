package practice;

public class P14 {
    static int r =4;
    public static void main(String[] args) {
        System.out.println(r);
        P14 p = new P14();
        int m =p.h(r);
        System.out.println(m);
    }
    public int h(int a )
    {
        return a+8;
    }
}
