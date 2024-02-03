package Week3;

public class COMP254003CLLRunnable {
    public static void main(String[] args) {
        COMP254003CLL cll = new COMP254003CLL();
        
        cll.display();

        cll.insertAtBeginning("Sohaib");

        cll.display();

        cll.insertAtEnd("Bob");
        cll.insertAtEnd("Alice");

        cll.display();

        cll.insertAtEnd("John");
        cll.insertAtEnd("Jane");

        cll.display();

        cll.insertAtPosition("Zaboomafoo", 2);
        
        cll.display();

        cll.insertAtPosition("scooby dooby doo", 4);

        cll.display();

        cll.deleteAtBeginning();

        cll.display();

        cll.deleteAtEnd();

        cll.display();

        cll.deleteAtPosition(2);

        cll.display();
    }
}
