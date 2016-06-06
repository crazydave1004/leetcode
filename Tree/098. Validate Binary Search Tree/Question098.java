public class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean dfs(TreeNode root, int left, int right) {
        if (root == null) return true;
        if (root.val == Integer.MAX_VALUE && root.right != null) return false;
        if (root.val == Integer.MIN_VALUE && root.left != null) return false;
        if (root.val > right || root.val < left) return false;
        return dfs(root.left, left, root.val - 1) && dfs(root.right, root.val + 1, right);
    }
}