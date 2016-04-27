public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        if (headA == headB) return headA;
        ListNode cur = headA;
        while (cur.next != null) cur = cur.next;
        cur.next = headA;
        ListNode fast = headB, slow = headB;
        while (true) {
            if (fast == null || fast.next == null) {
                cur.next = null;
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        ListNode p = headB;
        while (true) {
            if (p == slow) {
                cur.next = null;
                return p;
            }
            slow = slow.next;
            p = p.next;
        }
    }
}