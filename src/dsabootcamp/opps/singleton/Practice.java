package dsabootcamp.opps.singleton;

import dsabootcamp.opps.staticExamples.Human;

public class Practice {
    public static void main(String[] args) {
        Hum m =Hum.hum;
         Hum n;
        System.out.println(m);
        Hum m1 = new Hum();
        System.out.println(m1);
        System.out.println(m1.newMethod());

    }
}
class Hum{
    public static  Hum hum;
//    private Hum()
//    {
//
//    }
    public static Hum newMethod()
    {
        if(hum == null)
        {
            hum = new Hum();
        }
        return hum;
    }

}