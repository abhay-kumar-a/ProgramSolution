package practice.generics;

class Human
{

}
class Abhay extends Human
{

}
class Animal
{

}
class Dog extends Animal
{

}
class Bird
{

}
public class Practice {
    static <T extends Human> void printMethod(T o) {
        System.out.println("Hello Abhay How are you... : for Human class only");
    }

    public static void main(String[] args) {
        printMethod(new Human());
        printMethod(new Abhay());
    }
}
