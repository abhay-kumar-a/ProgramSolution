package linkedlist;
public class SinglyLinkedList
{
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    // representing head and tail of singlyLinkedList
    public Node head  = null;
    public Node tail  = null;

    // addNode() will add data into list
      void addNode(int data){
          // creating new node
          Node newNode  = new Node(data) ;


          // check
          if(head ==null){
              head=newNode;
          }
          else
          {
              tail.next=newNode;
              tail = newNode;
          }

    }
    // display data from list on console
    void display(){
          Node current = head;
          if(current==null)
          {
              System.out.println("List is empty");
          }
        System.out.println("SinglyLinkedList are : ");
          while (current!=null)
          {
              System.out.print(current.data + " ");
              current = current.next;
          }

      }

      public static void main(String[] args) {
          SinglyLinkedList linkedList = new SinglyLinkedList();
          linkedList.addNode(0);
          linkedList.display();

    }
}

