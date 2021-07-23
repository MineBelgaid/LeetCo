package ClassicProblems;

public class OddEven {

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
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null || head.next.next == null)
                return head;

            ListNode odd = head, even = head.next, headE = head.next, currEven = headE;

            odd.next = even.next;
            odd = odd.next;
            even = odd.next;

            while (odd.next != null && even.next != null) {
                odd.next = even.next;
                currEven.next = even;
                odd = odd.next;
                even = odd.next;
                currEven = currEven.next;
            }

            currEven.next = even;
            odd.next = headE;

            return head;

        }
    }
}
