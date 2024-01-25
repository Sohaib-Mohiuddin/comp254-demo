package Week3;

public class COMP254003CLLNode {
    private String data;
    private COMP254003CLLNode next;

    // Default Constructor - Instantiate a new Node with no data and no reference
    public COMP254003CLLNode() { }

    // Overloaded Constructor - Instantiate a new Node with data and no reference
    public COMP254003CLLNode(String data) {
        this.data = data;
        this.next = null;
    }

    // Overloaded Constructor - Instantiate a new Node with data and a reference
    public COMP254003CLLNode(String data, COMP254003CLLNode next) {
        this.data = data;
        this.next = next;
    }

    // Accessor Methods
    public String getData() {
        return this.data;
    }

    public COMP254003CLLNode getNext() {
        return this.next;
    }

    // Mutator Methods
    public void setData(String data) {
        this.data = data;
    }

    public void setNext(COMP254003CLLNode next) {
        this.next = next;
    }

    public String toString() {
        return String.valueOf(this.data);
    }
}
