
//   Definition for singly-linked list.
// class ListNode{
//    int data;
//    ListNode next;

// }
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

class e1 {

    public static void main(String[]args){
        ListNode listNode = new ListNode();
       ListNode head = listNode;
       for(int i =1;i<=5;i++){
           listNode.next = new ListNode(i);
           listNode = listNode.next;
       }
       System.out.println(middleNode(head.next).val);
    }
    
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}

