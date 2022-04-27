package dsabootcamp.customImplementationOfLinearDataStructure.linkedList;

public class DoublyLinkedList {

    Node head;
    int size;
    DoublyLinkedList()
    {
        this.size = 0;
    }
    // insertFirst
    void insertFirst(int data)
    {
        Node node = new Node(data);
        node.next = head;  // use for next (->)ref
        node.prev = null; //  first node prev always be null
        if(head != null) {  // here use it because in null.null cont =  to any this , show NullPointerException;
            head.prev = node; // for refer head prev (<-)
        }
        head= node;
        size++;
    }
    // insert At last
    void insertLast(int value)
    {
        if(head==null)
        {
            insertFirst(value);
            return;
        }
         Node node = new Node(value);
         Node temp  = head;
         for(int  i = 1;i<size;i++)
         {
             temp = temp.next;
         }
         temp.next=node;
         node.prev=temp;
         node.next=null;
         size++;
    }
    // get reference of any value:
    Node getReferenceOfAnyValue(int value)
    {
        Node  temp = head;

        while (temp!=null)
        {
            if(temp.val==value)
            {
                return temp;
            }
            else {
                temp= temp.next;
            }
        }
        return null;
    }
    // inset at any value ; means val =3 , and insert 5 the  output : [3]->[5]
    void insertAtPosition(int PositionValue,int value)
    {
        Node temp = getReferenceOfAnyValue(PositionValue);
        if(temp==null)
        {
            System.out.println("Does not exist");
            return ;
        }
        Node node = new Node(value);
        node.next= temp.next;
        node.next.prev= node;
        temp.next=node;
        node.prev=temp;
    }
    // deleteFirst
    int deleteFirst()
    {
        int val = head.val; ;
        if(head!=null)
        {
            head.next.prev = null;
            head=head.next;
        }
        return val;
    }
    int deleteFirst1()
    {
        int val = head.val;
        if(head!= null)
        {
            head= head.next;
            head.prev=null;
        }
        return val;
    }
    // deleteLast
    int deleteLast()
    {
        Node temp =head;
        Node last = temp;
        while (temp!=null)
        {
            last=temp;
            temp = temp.next;
        }
        int val=0;
        if(last!=null)
        {
            val = last.val;
            last.prev.next=null;
            last.prev=null;
        }
//        last=last.prev;
//        if(last!=null)
//        {
//            last.prev=null;
//        }
//        last.next=null;

        return val;
    }


    // display all nodes
    void display()
    {
        Node temp = head;
        Node last=null; /// for last element
        while (temp!= null)
        {
            System.out.print(temp.val+ " -> ");
            last=temp;
//            System.out.println(temp);
//            Syst
//
//
//            em.out.println(temp.next);
            temp= temp.next;
        }
        System.out.println("END");

        // also ,can reverse all node by traversing
        while (last!=null)
        {
            System.out.print(last.val+ " -> ");
            last=last.prev;
        }
        System.out.println("START");

    }
    private class  Node{
        int val;
        Node next;
        Node prev;
        Node(int val)
        {
            this.val = val;
        }
        Node(int val , Node next, Node prev)
        {
            this .val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
