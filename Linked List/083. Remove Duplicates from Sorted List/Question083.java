public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode cur = prev;
        while (cur.next != null) {
            if (cur.val != cur.next.val) {
                prev.next = cur.next;
                prev = prev.next;
            }
            cur = cur.next;
        }
        prev.next = cur.next;
        return head;
    }
}