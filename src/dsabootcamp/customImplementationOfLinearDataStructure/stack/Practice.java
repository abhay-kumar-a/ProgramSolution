package dsabootcamp.customImplementationOfLinearDataStructure.stack;

import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(2);
        a.add(3);
        System.out.println("Numbe ris "+a.push(45));
        a.push(5);
        a.push(57);
        a.push(3);
        a.push(15);
        System.out.println(a);
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        System.out.println(a);
    }
}
