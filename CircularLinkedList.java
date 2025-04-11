class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

// The addNode(int data) method adds a new node to the end of the circular linked list.
// If the list is empty, it initializes both head and tail with the new node, linking it back to itself.
// Otherwise, it appends the new node at the end and links the tail back to the head.
// The displayList() method prints the elements of the circular linked list. 
// It uses a do-while loop to traverse the list starting from the head until reaching the head again.
public class CircularLinkedList {
  private Node head;
  private Node tail;

  public void addNode(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      // First element
      head = newNode;
      tail = newNode;
      newNode.next = head; // Linking the first node to itself
    } else {
      // Adding a new node at the end of the circular linked list
      tail.next = newNode;
      tail = newNode;
      tail.next = head; // Linking the new node back to the head
    }
  }

  public void displayList() {
    if (head == null) {
      System.out.println("The circular linked list is empty.");
      return;
    }

    Node current = head;
    do {
      System.out.print(current.data + " -> ");
      current = current.next;
    } while (current != head);
    System.out.println("Head");
  }

  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();

    // Adding nodes to the circular linked list
    cll.addNode(1);
    cll.addNode(2);
    cll.addNode(3);
    cll.addNode(4);

    // Displaying the circular linked list
    cll.displayList();
  }
}
