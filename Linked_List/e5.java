import java.util.*;

class e5 {
    static class Node {
        int data;
        Node next;

    }

    // Function that convert
    // singly linked list into
    // circular linked list.
    static Node Circular(Node head) {
        Node start = head;
        while (head.next != null) {
            head = head.next;

        }
        head.next = start;
        return head;
    }

    static Node push(Node head, int data) {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
        return head;

    }

    static void display(Node node) {
        Node start = node;
        while (node.next != start) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.print(" " + node.data);
    }

    public static void main(String[] args) {
        // Start with empty list
        Node head = null;

        head = push(head, 15);
        head = push(head, 14);
        head = push(head, 13);
        head = push(head, 22);
        head = push(head, 17);

        Circular(head);

        System.out.print("Display list: \n");
        display(head);
    }
}