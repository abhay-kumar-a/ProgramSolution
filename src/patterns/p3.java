package patterns;

public class p3 {
    public static void main(String[] args) {
        UserDefine u = new UserDefine();
       u.man();
    }
}
 class M {
     M p ;
     int c =10 ;
     char b = 'v';
 }
 class UserDefine{
     M m;
     M c = new M();
     M l = c.p;
     int n = c.c;
     void man()
     {
         System.out.print(n);
         System.out.println(l);
     }


 }