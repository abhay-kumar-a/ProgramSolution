package dsabootcamp.opps.inheritance;

public class Main {
    public static void main(String[] args) {
        Box a = new Box();  // call default constructor
        System.out.println("l: "+ a.l + " ,w : "+ a.w +" ,h : "+a.h);


        Box b = new Box(4,5,6);  //
        System.out.println(b.l);
        System.out.println(b.w);
        System.out.println(b.h);


        // reference type parameter
        Box b1 = new Box(b);  // object created with reference type constructor
        System.out.println("b1.l : "+b1.l); //4
        System.out.println("b1.w : "+b1.w); //5
        System.out.println("b1.h : "+b1.h); // 0 by default

        // creating different class ref and different class object;
        Box box = new BoxWeight();

///---------------------------------------
        BoxWeight  boxWeight = new BoxWeight(); // here it calls BoxWeight construct and int BoxWeight cons it
          // automatic call Box class default constructor and check and initialise values and then come to BoxWeight constructor and
        // check and initialise values and then come to main class where it calls and print , checked values;
        // mean check two cons , fist reference class and then parent class , which class ir extend;
        System.out.println(boxWeight.l);
        System.out.println(boxWeight.w);
        System.out.println(boxWeight.h);
        System.out.println(boxWeight.weight);
        BoxWeight b3= new BoxWeight(boxWeight);
        System.out.println(b3.weight);
        System.out.println(b3.h);




    }
}