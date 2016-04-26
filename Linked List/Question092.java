public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) return head;
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode prev = dump;
        ListNode par = new ListNode(0);
        ListNode cur = head;
        int i = 1;
        while (cur != null && i <= n) {
            if (i < m) {
                prev = cur;
                cur = cur.next;
            } else if (i == m){
                par = prev;
                prev = cur;
                cur = cur.next;
            } else {
                prev.next = cur.next;
                cur.next = par.next;
                par.next = cur;
                cur = prev.next;
            }
            i++;
        }
        return dump.next;
    }
}