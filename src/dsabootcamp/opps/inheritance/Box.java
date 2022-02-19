package dsabootcamp.opps.inheritance;
// Parent class
public class Box {
    int l;int w;int h;
    Box() // default constructor
    {
        super();  // when
        this.l = -1;  // here initialise default values
        this.w = -1;
        this.h = -1;

    }
    Box ( int side)
    {
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(int l , int w)
    {
        this.l = l;
        this.w = w;

    }

    Box(int l, int w, int h)
    {
        this.l = l;
        this.w= w;
        this.h=h;
    }
    Box(Box other){
        this.l =other.l;  // work like    variable= value(initialised)
        this.w = other.w;  // this.w = other.h;
    }
}
