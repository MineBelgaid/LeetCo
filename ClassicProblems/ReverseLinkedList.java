package ClassicProblems;

public class ReverseLinkedList {

    public class ListNode {
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

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null)
                return null;
            ListNode curr = head.next, nextNode;
            head.next = null;
            while (curr != null) {
                nextNode = curr.next;
                curr.next = head;
                head = curr;
                curr = nextNode;
            }

            return head;
        }
    }
}
