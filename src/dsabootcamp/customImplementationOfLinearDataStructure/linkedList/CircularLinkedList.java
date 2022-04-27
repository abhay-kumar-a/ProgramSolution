

package dsabootcamp.customImplementationOfLinearDataStructure.linkedList;

public class CircularLinkedList {
    Node head ;
    Node tail;
    int size;
    CircularLinkedList()
    {
        this.size = 0;
    }
    // insertFirst
    void insertFirst(int value)
    {
        Node node = new Node(value);
        if(head == null)
        {
            head = node;
            tail =node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail=node;
    }

    /// display
    void display()
    {
        Node temp= head ;
        if(temp!= null)
        {
            do {
                System.out.print(temp.val+ " -> ");
                temp= temp.next;
            }while (temp!=head);
        }
    }

    private class Node {
        int val ;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
        Node(int val,  Node next)
        {
            this.val = val;
            this.next = next;
        }
    }
}
