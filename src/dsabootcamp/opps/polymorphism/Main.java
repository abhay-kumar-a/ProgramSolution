package dsabootcamp.opps.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        Shape circle= new Circle();   //  it will actually decide at runtime of circular.area  // it will override  area method
        circle.area();
        Shape square = new Square();
        square.area();
        Square shape1 = new Square();
        shape1.area();
//        Square s = new Shape();  /// can not create like that

    }
}
