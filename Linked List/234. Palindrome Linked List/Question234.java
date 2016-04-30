public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = slow.next;
        ListNode cur = prev.next;
        slow.next = null;
        ListNode dump = new ListNode(0);
        dump.next = prev;
        while (cur != null) {
            prev.next = cur.next;
            cur.next = dump.next;
            dump.next = cur;
            cur = prev.next;
        }
        ListNode p1 = head;
        ListNode p2 = dump.next;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) return false; 
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
        
    }
}