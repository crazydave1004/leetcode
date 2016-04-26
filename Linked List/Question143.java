public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next == null) break;
            fast = fast.next;
            slow = slow.next;
        }
        ListNode pointer = slow.next;
        slow.next = null;
        ListNode prev = pointer;
        ListNode cur = prev.next;
        while (cur != null) {
            ListNode tmp = cur;
            prev.next = cur.next;
            cur.next = pointer;
            cur = prev.next;
            pointer = tmp;
        }
        cur = head;
        while (cur.next != null) {
            ListNode p1 = cur;
            ListNode p2 = pointer;
            cur = cur.next;
            pointer = pointer.next;
            p1.next = p2;
            p2.next = cur;
        }
        cur.next = pointer;
    }
}