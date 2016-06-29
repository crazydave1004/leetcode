public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int l = 0;
        ListNode cur = head;
        while (cur != null) {
            l++;
            cur = cur.next;
        }
        if (k > l) return head;
        cur = head;
        ListNode dump = new ListNode(0);
        dump.next = cur;
        for (int i = 0; i < k - 1; i++) {
            ListNode node = cur.next;
            cur.next = node.next;
            node.next = dump.next;
            dump.next = node;
        }
        cur.next = reverseKGroup(cur.next, k);
        return dump.next;
    }
}