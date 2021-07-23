public class Intersection {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode currA = headA, currB = headB;
            int n = 0, m = 0;
            ListNode intA, intB;
            while (currA.next != null) {
                currA = currA.next;
                n++;
            }
            intA = currA;
            while (currB.next != null) {
                currB = currB.next;
                m++;
            }
            intB = currB;
            if (intB == intA) {
                while (intA == intB) {
                    currA = headA;
                    currB = headB;
                    for (int i = 0; i < n; i++) {
                        currA = currA.next;
                    }
                    n--;
                    for (int j = 0; j < m; j++) {
                        currB = currB.next;
                    }
                    m--;
                    intA = currA;
                    intB = currB;
                    if (intA == headA && intB == intA) {
                        return headA;
                    }
                }
                return intA.next;
            }
            return null;

        }
    }
}
