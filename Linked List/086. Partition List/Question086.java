public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode cur = dump, par, rec;
        while (cur.next != null && cur.next.val < x) {
            cur = cur.next;
        }
        par = cur;
        rec = par.next;
        while (cur.next != null) {
            if (cur.next.val < x) {
                par.next = cur.next;
                par = par.next;
                cur.next = cur.next.next;
                par.next = rec;
            } else {
                cur = cur.next;
            }
        }
        return dump.next;
    }
}