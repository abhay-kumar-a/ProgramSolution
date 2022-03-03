package dsabootcamp.stackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {

        System.out.println("Stack elements are : ");
        stackMethod(0);
    }
    static  void stackMethod(int i )
    {
        Stack s = new Stack();
        s.push(5);
        s.push(43);
        s.push(23);
        s.add(67);
        s.add(7);
        s.add(6);
        System.out.println(s.get(i));
        s.pop();
        if(i==s.size()-1)
        {
            return;
        }
//        System.out.println("StackElement are : ");

        stackMethod(i+1);
//        System.out.println("StackElement are : ");

    }

}
