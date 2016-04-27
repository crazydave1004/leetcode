public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null) return;
        ListNode prev = new ListNode(0);
        prev.next = node;
        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
    }
}