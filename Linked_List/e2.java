import java.util.*;

class e2 {
    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;

        }
    }

    public void push(int data) {
        ListNode n = new ListNode(data);
        n.next = head;
        head = n;
    }

    public int count(int value) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.val == value) {
                count++;
                curr = curr.next;
            }

        }
        return count;
    }

    public static void main(String args[]) {
        e2 llist = new e2();

        /*
         * Use push() to construct below list
         * 1->2->1->3->1
         */
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(3);
        llist.push(1);

        /* Checking count function */
        System.out.println("hello");
        System.out.println("Count of 1 is " + llist.count(1));
    }
}