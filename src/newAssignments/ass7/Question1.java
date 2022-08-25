package newAssignments.ass7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
1. Construct a list out of the following,
"USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada".
Convert the elements to Uppercase and Collect to a new list called G7Countries.
Join all the elements using comma and print them.

*/
public class Question1 {

    public static void main(String[] args) {
        List<String> countryName= Arrays.asList("USA","Japan","France","Germany","Italy","U.K","Canada");

        // Hold all elements in uppercase
        List<String> G7Countries = countryName.stream().map(o1 ->o1.toUpperCase()).collect(Collectors.toList());
        System.out.println(G7Countries);

        // using stream
        String G7countries = countryName.stream().collect(Collectors.joining(","));
        System.out.println(G7countries);
    }

}
