public class LinkedListCylceII {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null)
                return null;
            ListNode slow = head, fast = head;
            while (fast.next != slow) {
                if (fast.next == null || fast.next.next == null)
                    return null;
                slow = slow.next;
                fast = fast.next.next;
            }
            slow = slow.next;
            ListNode cur = head;
            while (cur != slow) {
                cur = cur.next;
                slow = slow.next
            }
            return slow;
        }
    }
}
