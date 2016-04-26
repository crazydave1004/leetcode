public class Solution {
    ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        int l = 1;
        while (cur.next != null) {
            cur = cur.next;
            l++;
        }
        node = head;
        return helper(0, l - 1);
    }
    private TreeNode helper(int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode left = helper(start, mid - 1);
        TreeNode root = new TreeNode(node.val);
        node = node.next;
        TreeNode right = helper(mid + 1, end);
        root.left = left;
        root.right = right;
        return root;
    }
}