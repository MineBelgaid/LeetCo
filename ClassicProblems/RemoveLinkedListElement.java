package ClassicProblems;

public class RemoveLinkedListElement {

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
        public ListNode removeElements(ListNode head, int val) {
            if (head == null)
                return null;
            while (head.val == val) {
                head = head.next;
                if (head == null)
                    return null;
            }
            ListNode prev = head, curr = head.next;
            while (curr != null) {
                if (curr.val == val) {
                    prev.next = curr.next;
                    curr = prev.next;
                } else {
                    prev = prev.next;
                    if (prev == null)
                        return head;
                    curr = prev.next;
                }
            }
            return head;

        }
    }
}
