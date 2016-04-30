public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;  
        ListNode dump = new ListNode(0);  
        ListNode cur = head;
        while(cur != null) {  
            ListNode tmp = cur.next;  
            ListNode prev = dump;  
            while (prev.next != null && prev.next.val < cur.val) prev = prev.next;  
            cur.next = prev.next;  
            prev.next = cur;
            cur = tmp;  
        }  
        return dump.next;  
    }
}