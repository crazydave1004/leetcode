public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode tail = start;
        ListNode first = head;
        ListNode second = head.next;
        while (first != null && second != null) {
            first.next = second.next;
            second.next = first;
            tail.next = second;
            tail = first;
            if (first.next == null) break;
            second = first.next.next;
            first = first.next;
        }
        return start.next;
    }
}