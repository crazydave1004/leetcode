public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode prev = tmp;
        ListNode cur = head;
        boolean dup = false;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                dup = true;
            } else {
                if (dup) {
                    prev.next = cur.next;
                    dup = false;
                } else {
                    prev = cur;
                }
            }
            cur = cur.next;
        }
        if (dup) prev.next = cur.next;
        return tmp.next;
    }
}