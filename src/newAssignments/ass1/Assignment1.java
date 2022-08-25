package newAssignments.ass1;
import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        list.add("All's Well That Ends Well");
        list.add("As You Like it");
        list.add("Comedy of Errors");
        list.add("Love's Labour's Lost");
        list.add("Measure of Measure");
        list.add("Merchant of Venice");
        list.add("Merry Wives of Windsor");
        list.add("Midsummer Night's Dream");
        list.add("Much Ado about Nothing");
        list.add("Taming of the Shrew");
        list.add("Tempest");
        list.add("Twelfth Night");
        list.add("Two Gentlemen of Verona");
        list.add("Winter's Tale");

// Questions1
        // 1. Insert "Macbeth" to the front.

        list.addFirst("Macbeth");
        // 2.
        list.remove("Tempest");
        //3.
        String s = list.get(list.size()-1);
        String s1 =list.get(list.size()-2);
        list.set(list.size()-2,s);
        list.set(list.size()-1,s1);

        // 4. clone list
        LinkedList<String> copyClone =(LinkedList<String>) list.clone();
       // System.out.println("Clone are : \n"+copyClone);
        // 5. Remove and return the first element
        String removeFirst = list.removeFirst();
        System.out.println(removeFirst);
        // 6.
        System.out.println(list.peekFirst());
        //7.
        System.out.println(list.peekLast());

        // 8.Convert to arrayList
        ArrayList<String> arrayList = new ArrayList<>(list);
        System.out.println("ArrayList elements \n"+ arrayList);



//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
////        System.out.println("Size of list : "+  list.size());





    }
}
