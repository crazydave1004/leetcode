/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode head = new ListNode(0);
        ListNode c = head;
        int carry = 0;
        while (c1 != null || c2 != null) {
            int value = 0;
            if (c1 == null) {
                value = c2.val + carry;
                c2 = c2.next;
            } else if (c2 == null) {
                value = c1.val + carry;
                c1 = c1.next;
            } else {
                value = c1.val + c2.val + carry;
                c1 = c1.next;
                c2 = c2.next;
            }
            carry = value / 10;
            value = value % 10;
            c.next = new ListNode(value);
            c = c.next;
        }
        if (carry != 0) c.next = new ListNode(carry);
        return head.next;
    }
}