package java8.examles;

public class FunctionalInterfaceTest implements FunctionalInterfaceDemo {
	@Override
	public void test() {
		System.out.println("I am an abstract methods");
	}
	@Override
	public void defaultMethod() {
		System.out.println("default method");
	}
	public static void main(String[] args) {
		FunctionalInterfaceTest t= new FunctionalInterfaceTest();
		t.defaultMethod();
		t.test();
		FunctionalInterfaceDemo.staticMethod();
	}
}
