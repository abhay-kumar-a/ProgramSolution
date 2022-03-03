package dsabootcamp.linkedList;

//import org.w3c.dom.Node;

public class LinkedLists {
    private Node head;
    private Node tail;
    int size;

    public LinkedLists() {
        this.size = 0;
    }
// insertAtFirst ;
    void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head; // on creating of first node , node.next  value is null
        head= node;
        if(tail == null)
        {
            tail = head;
        }
        size++;

    }
    // insertLast
    void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
//        node.next = tail;
         tail.next=node;
        tail= node;
        size++;

    }
    // insert at any position :
    void insertAtPosition(int value,int index)
    {
        try {
            if (index == 0) {
                insertFirst(value);
                return;
            }
            if (index == size) {
                insertLast(value);
                return;
            }
            Node temp = getReference(index);
            // or bottom for loop
//            for (int i = 1; i < index; i++) {
//                temp = temp.next;
//            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }
        catch (Exception e)
        {
            System.out.println("Please Enter valid index");
        }
    }
// delete node from start
    int  deleteStart()
    {
//        System.out.println(head);
//        System.out.println(head.next);
        int val = head.val;
        System.out.println("new next "+ head.next);
        head = head.next;
        if(head==null)
        {
            tail =null;
        }
        size--;
        return val;

//        System.out.println(head);
//        System.out.println(head.next);
    }
    // get reference of any index
     public  Node getReference(int index)
     {
         Node node = head;
         for(int i = 1 ;i<index;i++)
         {
             node = node.next;
         }
         return node;
     }

    // delete at last node
    int deleteLast()
    {
        if(size<=1)
        {
          return  deleteStart();
        }
        Node secondLast  = getReference(size-1);
        int val = secondLast.next.val;  // here use next.next value //  1->2->3; here for 1 next.next.value is 3; and next.value is 2;
        tail = secondLast;
        tail.next = null;

//        Node temp = head;
//
        // also can use this logic
//        for(int i = 1;i<size-1;i++)  //
//        {
//            temp = temp.next;
//        }
//        int val = temp.next.val;
//        tail= temp;
//        temp.next= null; //  for remove of tail from last node ;
       size--;
        return val;
    }
    // delete at any index
     public int deleteAtIndex(int index)
     {
//         int val=0;
         if(index == 0)
         {
//              deleteStart();
              return deleteStart();
         }
         if(index == size-1)
         {
              return deleteLast();
         }
         Node temp = getReference(index);
          int val = temp.next.val;
           temp.next=temp.next.next;  //  [1]->[2]->[3]  // 1.next = 1.next.next means 1.next =[3]
         size--;

         return  val;
     }
     // find node of anyValue
    Node findNode(int value)
    {
        Node temp  = head;
        int count =0;
        while (temp != null)
        {
            if(temp.val == value)
            {
                System.out.println("size is : "+ size);
                System.out.println("Value  is : "+ value);
                if(count<=size)
                {
                    System.out.println("Index is :  "+ count);
                }
                else {
                    System.out.println("Index is : can't find");
                }
                return temp;
            }
            else {
                temp = temp.next;
            }
            count++;
        }
        System.out.println("size is : "+ size);
        System.out.println("Value  is : "+ value);
        if(count<=size)
        {
            System.out.println("Index is :  "+ count);
        }
        else {
            System.out.println("Index is : can't find");
        }
        return null;
    }

    // display these items;
    void display()
    {
        Node temp = head;  // we move head for print all node till null :
        while (temp!=null)
        {
            System.out.print (temp.val+" -> ");
            temp = temp.next;  // here next hold the previous node address ,so I initialise temp = temp.next; by this next hold values come to temp :
        }
        System.out.println("null");

    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

//    public static void main(String[] args) {
//        LinkedLists l = new LinkedLists();
//        Node n = new Node(23);
//        System.out.println(n.val);
//
//    }
}
