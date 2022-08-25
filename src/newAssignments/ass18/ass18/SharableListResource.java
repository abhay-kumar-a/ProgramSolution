package newAssignments.ass18.ass18;

import java.util.List;

public class SharableListResource {
     List<String> list ;
     public  SharableListResource(List<String>list)
     {
         this.list = list;
     }
     void addListElement()
     {
         while (true)
         {
             synchronized (this)
             {
                 list.add("Hello");
                 list.add("Abhay");
                 System.out.println(" producer produce list : "+ list);
                 this.notify();
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
     }

     void removeListElement()
     {
         while (true)
         {
             synchronized (this)
             {
                 if(list.isEmpty() == false)
                 {
                     System.out.println("List is empty and waiting for add element form addElement thread ");
                     try {
                         wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
                 list.clear();
                 System.out.println("Consumer consume and cleared : "+ list.isEmpty());
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
     }
}
