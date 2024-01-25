package Week3;

import Week3.Base_Files.CLL;
import Week3.Base_Files.CLLNode;
import Week3.Base_Files.LinkedList;
import Week3.Base_Files.Node;

public class CloneLinkedList {
    public static void cloneLinkedList(LinkedList list) {
        LinkedList clone = new LinkedList();
        Node current = list.getHead();
        while (current != null) {
            clone.insertAtEnd(current.getData());
            current = current.getNext();
        }
        System.out.println("Clone of the linked list: ");
        System.out.println("list == clone: " + (list == clone));
        System.out.println("list.equals(clone): " + list.equals(clone));
        System.out.println("list.getHead() == clone.getHead(): " + (list.getHead() == clone.getHead()));
        System.out.println("list.getTail() == clone.getTail(): " + (list.getTail() == clone.getTail()));
    }

    public static void cloneCLL(CLL list) {
        CLL clone = new CLL();
        CLLNode current = list.getHead();
        while (current != null) {
            clone.insertAtEnd(current.getData());
            current = current.getNext();
        }
        System.out.println("Clone of the circular linked list: ");
        System.out.println("list == clone: " + (list == clone));
        System.out.println("list.equals(clone): " + list.equals(clone));
        System.out.println("list.getHead() == clone.getHead(): " + (list.getHead() == clone.getHead()));
        System.out.println("list.getTail() == clone.getTail(): " + (list.getTail() == clone.getTail()));
    }
}
