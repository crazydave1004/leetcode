public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int l = 0;
        ListNode p = new ListNode(0);
        p.next = head;
        while (p.next != null) {
            l++;
            p = p.next;
        }
        int r = k % l;
        if (r == 0) return head;
        int i = 0;
        ListNode node = new ListNode(0);
        node.next = head;
        while (node.next != null && i < l - r) {
            node = node.next;
            i++;
        }
        ListNode tmp = node.next;
        node.next = null;
        p.next = head;
        return tmp;
    }
}