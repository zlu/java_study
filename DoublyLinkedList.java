class Node {
  int data;
  Node next;
  Node prev;

  public Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class DoublyLinkedList {
  private Node head;

  public DoublyLinkedList() {
    this.head = null;
  }

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev = temp;
  }

  public void delete(int data) {
    if (head == null) {
      return;
    }
    if (head.data == data) {
      head = head.next;
      if (head != null) {
        head.prev = null;
      }
      return;
    }
    Node temp = head;
    while (temp != null && temp.data != data) {
      temp = temp.next;
    }
    if (temp != null) {
      if (temp.next != null) {
        temp.next.prev = temp.prev;
      }
      if (temp.prev != null) {
        temp.prev.next = temp.next;
      }
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.display(); // Output: 10 <-> 20 <-> 30 <-> null

    list.delete(20);
    list.display(); // Output: 10 <-> 30 <-> null
  }
}
