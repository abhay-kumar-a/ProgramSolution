package newAssignments.ass5;

interface SquareRoot {
    double calculate(double value);
}

class Q2 {
    public static void main(String [] args)
    {
        double num = 25d;

        // lambda expression to evaluate the calculate method
        SquareRoot squareRoot = (double n1) -> Math.sqrt(n1);

        double result = squareRoot.calculate(num);
        System.out.println(result);
    }
}