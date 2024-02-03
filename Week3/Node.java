package Week3;

public class Node {
    private Integer data; // Integer data for Node
    private Node next; // Reference to next Node

    // Constructor
    public Node() { }

    // Constructor
    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }

    // Constructor
    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Getters and Setters
    public Integer getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // toString method
    public String toString() {
        return String.valueOf(this.data);
    }

    // equals method
    public boolean equals(Node node) {
        return this.data.equals(node.getData());
    }
}
