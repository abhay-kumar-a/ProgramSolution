package newAssignments.ass1;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment2 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("The Incredible Hulk");
        arrList.add("Iron Man 2");
        arrList.add("Thor");
        arrList.add("Captain America: The First Avenger");
        arrList.add("Marvel's The Avengers");
        arrList.add("Iron Man 3");
        arrList.add("Thor: The Dark World");
        arrList.add("Captain America: The Winter Soldier");
        arrList.add("Guardians of the Galaxy");
        arrList.add("Avengers: Age of Ultron");
        arrList.add("Ant-Man");
        System.out.println(arrList);

       // Questions1:
        //1.Create a new last five movies
        ArrayList<String> arr1 = new ArrayList<>();
        for(int i = arrList.size()-5;i<arrList.size();i++)
        {
            arr1.add(arrList.get(i));
        }
        System.out.println(arr1);

        // 2.Shuffle the original list.
        Collections.shuffle(arrList);
        System.out.println(arrList);

        //3. Create a clone of the list
        ArrayList<String> cloneCopy = (ArrayList<String>)arrList.clone();

        // 4.Increase the capacity to 30 and add more movie to the list.

        arrList.ensureCapacity(30);
        arrList.add("Shimla Mirchi");
        arrList.add("Sub Kushal Mangal");
        arrList.add("Darbar");
        arrList.add("Tanhaji");
        arrList.add("Chhapaak");
        arrList.add("Street Dancer 3D");
        arrList.add("Panga");
 // 5.Remove unoccupied space of Array list and fix the capacity of ArrayList as its current size.
        int fixedCapacity = arrList.size();
       // System.out.println(fixedCapacity);
        arrList.ensureCapacity(fixedCapacity);
       // arrList.add(19,"4355433"); //showing indexOutOfBound // now
                                            // capacity fixed according size.
        // 6. Empty the list.
        arrList.clear();
        System.out.println(arrList);


    }
}
