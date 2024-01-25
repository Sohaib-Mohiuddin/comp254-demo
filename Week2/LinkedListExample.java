import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Using our own linked list class
        
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);

        linkedList.display(); // Output: 10 20 30

        linkedList.insertAtBeginning(5);
        linkedList.display(); // Output: 5 10 20 30

        linkedList.insertInBetween(15, 3);
        linkedList.display(); // Output: 5 10 15 20 30

        linkedList.removeFromEnd();
        linkedList.display(); // Output: 5 10 15 20

        linkedList.removeFromBeginning();
        linkedList.display(); // Output: 10 15 20

        linkedList.removeFromInBetween(2);
        linkedList.display(); // Output: 10 20
        
    }
}
