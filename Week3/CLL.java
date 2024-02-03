package Week3;

/*
 * Circular Linked List Implementation
 */
public class CLL {

    /*
     * Declare the head, tail and size variables
     */
    private CLLNode head;
    private CLLNode tail;
    private Integer size;

    /*
     * Constructor
     */
    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Method to set the head
     * @param head
     */
    public void setHead(CLLNode head) {
        this.head = head;
    }

    /**
     * Method to set the tail
     * @param tail
     */
    public void setTail(CLLNode tail) {
        this.tail = tail;
    }

    /**
     * Method to get the head
     * @return head
     */
    public CLLNode getHead() {
        return this.head;
    }

    /**
     * Method to get the tail
     * @return tail
     */
    public CLLNode getTail() {
        return this.tail;
    }

    /**
     * Method to insert a node at the beginning of the circular linked list
     * @param data
     */
    public void insertAtBeginning(Integer data) {
        CLLNode newNode = new CLLNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        } else {
            newNode.setNext(head);
            head = newNode;
            tail.setNext(head);
        }
        size++;
    }

    /**
     * Method to insert a node at the end of the circular linked list
     * @param data
     */
    public void insertAtEnd(Integer data) {
        CLLNode newNode = new CLLNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
        size++;
    }

    /**
     * Method to insert a node at a given position in the circular linked list
     * @param data
     * @param position
     */
    public void insertAtPosition(Integer data, Integer position) {
        CLLNode newNode = new CLLNode(data);
        if (head == null || position <= 0) {
            insertAtBeginning(data);
        } else {
            CLLNode current = head;
            for (int i = 1; i < position - 1 && current != tail; i++) {
                current = current.getNext();
            }
            if (current != tail) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            } else {
                insertAtEnd(data);
            }
        }
        size++;
    }

    /**
     * Method to remove a node from the beginning of the circular linked list
     */
    public void removeFromBeginning() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            tail.setNext(head);
        }
        size--;
    }

    /**
     * Method to remove a node from the end of the circular linked list
     */
    public void removeFromEnd() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            CLLNode current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            current.setNext(head);
            tail = current;
        }
        size--;
    }

    /**
     * Method to remove a node from a given position in the circular linked list
     * @param position
     */
    public void removeFromPosition(Integer position) {
        if (head == null || position <= 0) {
            return;
        }
        if (position == 1) {
            removeFromBeginning();
        } else {
            CLLNode current = head;
            for (int i = 1; i < position - 1 && current != tail; i++) {
                current = current.getNext();
            }
            if (current != tail) {
                current.setNext(current.getNext().getNext());
            } else {
                removeFromEnd();
            }
        }
        size--;
    }

    /**
     * Method to print the circular linked list
     */
    public void display() {
        if (head == null) {
            return;
        }
        CLLNode current = head;
        do {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        } while (current != head);
        System.out.println();
    }
}
