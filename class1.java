public class class1 {
    public class LinkedListNode{
        int val;
        LinkedListNode next;
         public LinkedListNode(int var) {
            this.val = val;
        }
    }
    public LinkedListNode reverseLinkedList(LinkedListNode head) {
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        while (curr != null) {
            LinkedListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
