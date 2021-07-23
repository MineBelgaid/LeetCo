public class TwoPointer {

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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode remove = head;
            ListNode curr = head;
            int sz = 0;
            if (head.next == null) {
                head = null;
                return head;
            }
            for (int i = 0; i < n; i++) {
                curr = curr.next;
                sz++;
            }
            if (curr != null) {

                while (curr.next != null) {
                    curr = curr.next;
                    remove = remove.next;
                    sz++;
                }
            } else
                sz--;
            if (sz == n - 1) {
                head = head.next;
            } else {

                remove.next = remove.next.next;
            }

            return head;
        }
    }
}
