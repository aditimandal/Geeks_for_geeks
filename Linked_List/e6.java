
//Exchange first and last nodes in Circular Linked List
import java.util.*;

class e6 {
    static class Node {
        int data;
        Node next;
    }

    // function that convert singly linked list to circular linked list
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
        System.out.print(" " + node.data + "\n");
    }

    static Node exchange(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node tail = head;
        while (tail.next != head) {
            tail = tail.next;
        }

        int temp = tail.data;
        tail.data = head.data;
        head.data = temp;
        return head;
    }

    public static void main(String[] args) {

        Node head = null;

        head = push(head, 15);
        head = push(head, 14);
        head = push(head, 13);
        head = push(head, 17);
        head = push(head, 22);

        Circular(head);
        display(head);
        head = exchange(head);
        System.out.println("after exchange");
        display(head);

    }

}