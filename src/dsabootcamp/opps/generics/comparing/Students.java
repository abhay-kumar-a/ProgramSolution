package dsabootcamp.opps.generics.comparing;

public class Students implements Comparable<Students> {  // which type you want to compare Students type                // here java will be confused which variable you want to compare ,you have two instance variable, marks and rollNumber,
                                                               // so for solve these problems we use generic comparable interface;
    float marks;
    int rollNumber;

    @Override
    public String toString() {
        return marks+" ";

    }

    public Students(float marks, int rollNumber) {
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    @Override
    public int compareTo(Students o) {    /// Comparable interface method by default , necessary to implement them for override
        int diff = (int)(this.marks-o.marks);  // here we decide which instance variable will be pass for compare ,  like here use marks , also can use rollNumber as well
        return diff;

        // and the output will be like  // if diff ==0 : means both are equal
        //  if diff <0 : means o is bigger else o is smaller
    }
}
