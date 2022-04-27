package practice.trickyQuestions;

public class Q3 {
    public static void main(String[] args) {
        /// find NaN number ( a number which is not defined in java or any other programming language)

        System.out.println(23 / 9);
//        System.out.println(23 / 0);  // show Arithmetic exception it will occur at run time
//        System.out.println(0/0);  // also give Arithmetic exception
        // double of float values
        System.out.println(1.4/0); // print Infinity  // number overflow exception
        System.out.println(1.4/0.0); /// Infinity
        System.out.println(0/0.0);  // here it will give 'NaN'
        System.out.println(0.0/0.0); // NaN
        System.out.println(Math.sqrt(-1));  // NaN

        // with wrapper classes we also have NaN variable
        System.out.println("Wrapper classes");
        System.out.println(Float.NaN == Float.NaN);// false  // if number is not define , so definitely its false
        System.out.println(Double.NaN ==  Double.NaN); // false  //

        // Integer did not have NaN variable

        double a = 1.4%0;
        System.out.println(a);  // NaN  // because we can't find Infinity number reminder

    }
}

