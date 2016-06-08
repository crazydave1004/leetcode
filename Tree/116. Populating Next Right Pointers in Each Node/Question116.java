public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        helper(root);
    }
    
    public void helper(TreeLinkNode root) {
        if (root.left == null && root.right == null) return;
        root.left.next = root.right;
        if (root.next != null) root.right.next = root.next.left;
        helper(root.left);
        helper(root.right);
    }
}