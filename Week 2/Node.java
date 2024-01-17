public class Node {
    private String data; // String data for Node
    private Node next; // Reference to next Node

    // Constructor
    public Node() { }

    // Constructor
    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Getters and Setters
    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // toString method
    public String toString() {
        return this.data;
    }

    // equals method
    public boolean equals(Node node) {
        return this.data.equals(node.getData());
    }
}
