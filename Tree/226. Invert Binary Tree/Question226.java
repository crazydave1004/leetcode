public class Solution {
    public TreeNode invertTree(TreeNode root) {
         if (root == null) return null;
         helper(root);
         return root;
    }
    public void helper(TreeNode root) {
        if (root.left != null && root.right != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            helper(root.left);
            helper(root.right);
        } else if (root.left == null && root.right != null) {
            root.left = root.right;
            root.right = null;
            helper(root.left);
        } else if (root.left != null && root.right == null) {
            root.right = root.left;
            root.left = null;
            helper(root.right);
        }
    }
}