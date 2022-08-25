package newAssignments.ass4;

public class Question1 {
        public static void main(String[] args) {

            StringBuffer s1 = new StringBuffer("example.com");
            StringBuffer s2 = new StringBuffer("example.com");

            StringBuffer s3 = new StringBuffer("Example.com");
            StringBuffer s4 = new StringBuffer("example.co");

            System.out.println(s1.toString().equals(s2.toString())); // true

            System.out.println(s3.toString().equals(s4.toString())); // false
        }
    }