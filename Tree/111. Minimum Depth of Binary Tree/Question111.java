public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return depth(root);
    }
    public int depth(TreeNode root) {
        if (root == null) return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        if (l == 0) return r + 1;
        if (r == 0) return l + 1;
        return Math.min(l, r) + 1;
    }
}