class Node {
  int data;
  Node next;

  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}

class LinkedList {
  private Node head;

  public LinkedList() {
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
  }

  public void delete(int data) {
      if (head == null) {
          return;
      }
      if (head.data == data) {
          head = head.next;
          return;
      }
      Node temp = head;
      while (temp.next != null && temp.next.data != data) {
          temp = temp.next;
      }
      if (temp.next != null) {
          temp.next = temp.next.next;
      }
  }

  public void display() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.insert(10);
      list.insert(20);
      list.insert(30);
      list.display(); // Output: 10 -> 20 -> 30 -> null
      
      list.delete(20);
      list.display(); // Output: 10 -> 30 -> null
  }
}
