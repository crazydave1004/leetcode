public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        } 
        while (true) {
            if (fast == null) {
                head = slow.next;
                return head;
            }
            if (fast.next == null) {
                slow.next = slow.next.next;
                return head;
            }
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            } 
        }
    }
}