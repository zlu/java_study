import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        System.out.println("LinkedList: " + linkedList);

        // Accessing elements
        System.out.println("First element: " + linkedList.get(0));

        // Removing elements
        linkedList.remove(1);
        System.out.println("After removing second element: " + linkedList);
    }
}
