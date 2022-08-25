package newAssignments.ass18;

import java.util.ArrayList;
import java.util.List;

public class SharableListThread {

    List<Integer> list = new ArrayList<>();

    synchronized void  add(Integer n)
    {
        System.out.println("element  adding....");
        list.add(n);
        System.out.println("Element add..");
    }
    void addAtRemovedIndex(int index, int element)
    {
        System.out.println("Element adding");
        list.add(index, element);
        System.out.println("Element added");
       // notify();
    }
   synchronized  void remove( int index)
    {
        System.out.println("Element removing ");
       try
       {
           list.remove(index);
       }catch (ArrayIndexOutOfBoundsException e)
       {
           try {
               wait();
           } catch (InterruptedException ex) {
               addAtRemovedIndex(index,45);
               ex.printStackTrace();
           }
       }
        System.out.println("Element removed");
    }

    void getList()
    {
        System.out.println(list);
    }
}
