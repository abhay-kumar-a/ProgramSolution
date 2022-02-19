package dsabootcamp.opps.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        Shape circle= new Circle();
        circle.area();
        Shape square = new Square();
        square.area();
        Square shape1 = new Square();
        shape1.area();
//        Square s = new Shape();  /// can not create like that

    }
}
