package dsabootcamp.opps.interfaces.A;


class M1 {
   public void Hello()
   {
       System.out.println("Hello I am from M1");
   }
}
class M2 extends M1{

}
public class InheritancesExample  extends M2{
    public static void main(String[] args) {
        M2 m = new M2();
        m.Hello();
    }
}
