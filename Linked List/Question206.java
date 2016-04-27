public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            prev.next = cur.next;
            cur.next = dump.next;
            dump.next = cur;
            cur = prev.next;
        }
        return dump.next;
    }
}