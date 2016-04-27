public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head, leftpart = head;
        //Find the mid node of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rightpart = slow.next;
        slow.next = null;
        
        ListNode left = null, right = null;
        if (leftpart != rightpart) {
            left = sortList(leftpart);
            right = sortList(rightpart);
        }
        return merge(left, right);
    }
    
    //Merge two sorted linkedlists
    public ListNode merge(ListNode left, ListNode right) {
        if (right == null) return left;
        if (left == null) return right;
        ListNode dump = new ListNode(0);
        ListNode p = dump;
        while (left != null && right != null) {
            if (left.val < right.val) {
                p.next = left;
                p = p.next;
                left = left.next;
            } else {
                p.next = right;
                p = p.next;
                right = right.next;
            }
        }
        if (left != null) p.next = left;
        if (right != null) p.next = right;
        return dump.next;
    }
}