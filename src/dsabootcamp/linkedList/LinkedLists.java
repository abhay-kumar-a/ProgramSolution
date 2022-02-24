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
        node.next = head;
        head= node;
        if(tail == null)
        {
            tail = head;
        }

    }
    // display these items;
    void display()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.print (temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("End");

    }

    private static class Node {
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
