package dsabootcamp.opps.inheritance;
// child class
public class BoxWeight extends Box {  // inherit Box class over here,you can simply  incorporate definition of any class into another class by using extend class

    int weight;

    BoxWeight()
    {
        super();
      this.l = -4;
      this.w = -4;
      this.h = -4;
      this.weight=-4;
    }
    BoxWeight(int weight)
    {
        this.weight= weight;
    }
    BoxWeight(int side,int weight)
    {
           super(side);   // super is used to immediate call parent class constructor
           this.weight = weight;
    }
    BoxWeight(BoxWeight other)
    {
        super(other);
        this.weight = 5;
    }

    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h); // use to initialise values in parent class
        this.weight = weight;
    }
    // // creating different class ref and different class object;
  //  BoxWeight  boxWeight = new BoxWeight();

}
