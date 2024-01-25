package Week3.Base_Files;

/*
 * Circular Linked List Node
 */
public class CLLNode {
    private Integer data;
    private CLLNode next;

    public CLLNode(Integer data) {
        this.data = data;
        this.next = null;
    }

    public Integer getData() {
        return this.data;
    }

    public CLLNode getNext() {
        return this.next;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }

    public String toString() {
        return String.valueOf(this.data);
    }
}