package dsabootcamp.opps.generics.LambdaExpression;

import dsabootcamp.arrays.ArrayLists;
import dsabootcamp.opps.interfaces.nested.A;

import java.util.ArrayList;
import java.util.function.Consumer;

// in lambda function you only need operation not any method name required ;
public class LambdaFunction {
    public static void main(String[] args) {
//        int a =5;int b=4; int c = sum(a,b);
//        System.out.println(c);
//        int[] arr1 = new int[10];
//        for(int i = 0;i<10;i++){   //  lambda not work with primitives types
//            arr1[i]=i;
//        }
        ArrayList<Integer> arr = new ArrayList<>();  // only work with reference type
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
//       arr.forEach((item) -> System.out.println(item*2));  // this item take element for arr one by one and print it //  it is of consumer type variable so also can store in consumer
//        // containing parameter      //this is body of loop
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);


        // pass parameter using interface and method
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;

        LambdaFunction myCalculator = new LambdaFunction();
        System.out.println(myCalculator.operator(5, 6, sum));
        System.out.println(myCalculator.operator(5, 6, sub));
        System.out.println(myCalculator.operator(5, 6, mul));
    }

    private int operator(int a, int b, Operation op) {
        return op.operations(a, b);
    }
}

interface  Operation{
       int  operations(int a ,int b);
    }

