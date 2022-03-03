package dsabootcamp.linkedList;


public class Main {
    public static void main(String[] args) {

        // singly LinkedList
      LinkedLists l = new LinkedLists();
//        System.out.println(l.size);
//        l.insertFirst(5);
//        l.insertFirst(6);
//        l.insertFirst(7);
//        l.display();
//        l.insertAtPosition(23, 2);
//        l.display();
//        l.insertLast(4535);
//        l.display();
//        l.insertAtPosition(44,2);
//        l.display();
//        System.out.println(l.deleteStart());
////        l.deleteStart();
//        l.display();
////        l.deleteLast();
   //    System.out.println(l.deleteLast());
//        l.display();
//        System.out.println(l.deleteAtIndex(2));
//        l.display();
//        System.out.println("Reference is : "+ l.findNode(6));

        // Doubly LinkedList
        DoublyLinkedList d = new DoublyLinkedList();
//        d.insertFirst(4);
//        d.insertFirst(1);
//        d.insertFirst(9);
//        d.insertFirst(5);
//        d.insertFirst(90);
//        d.insertFirst(7);
//        d.display();
//        d.insertLast(45);d.insertLast(42);
//        d.display();
//        d.insertFirst(34);
//        d.insertLast(456);
//        d.display();
//        d.insertAtPosition(9,4567);
//        d.display();
//      System.out.println(d.deleteFirst());
//      d.display();
//      System.out.println(d.deleteLast());
//      d.display();

      // Circular Linked List
      CircularLinkedList list = new CircularLinkedList();
      list.insertFirst(45);
      list.insertFirst(4);
      list.insertFirst(455);
      list.insertFirst(6);
      list.display();

    }
}
