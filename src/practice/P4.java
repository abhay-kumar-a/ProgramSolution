package practice;

public class P4 {

    public static void main(String[] args) {
//        Integer n = new Integer(null);  // number format exception its not part of Integer number system
 //       String b = new String(null);  //ava: reference to String is ambiguous
                                         // both constructor String(java.lang.StringBuffer) in java.lang.String and constructor String(java.lang.StringBuilder) in java.lang.String match

    StringBuilder b1 = new StringBuilder(null);  // throw null pointer exception , because null did not have length , and . length() method did not work
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
    }
}
