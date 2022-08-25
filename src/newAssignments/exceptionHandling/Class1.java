package newAssignments.exceptionHandling;

public class Class1 {
    public static void main(String[] args) {
        System.out.println(java.time.LocalTime.now());
        m1();
        System.out.println(java.time.LocalTime.now());

    }

    private static void m1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1");
        System.out.println(java.time.LocalTime.now());
        m2();

    }

    private static void m2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2");
        System.out.println(java.time.LocalTime.now());
        m3();

    }

    private static void m3() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m3");
        System.out.println(java.time.LocalTime.now());
        m4();

    }

    private static void m4() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m4");
       // System.out.println(java.time.LocalTime.now());

    }
}
