//Detect loop in a linked list
public class m1 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void push(int data) {
        Node n = new Node(data);

        n.next = head;
        head = n;

    }

    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        m1 ll = new m1();
        ll.push(11);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);

        /* Create loop for testing */
        ll.head.next.next.next.next = ll.head;

        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");

    }

}
