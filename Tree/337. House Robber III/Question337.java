public class Solution {
    public int rob(TreeNode root) {
        int[] dp = helper(root);
        return dp[0];
    }
    public int[] helper(TreeNode root) {
        int[] tmp = new int[3];
        if (root == null) return tmp;
        if (root.left == null && root.right == null) {
            tmp[0] = root.val;
        } else {
            int[] left = helper(root.left);
            int[] right = helper(root.right);
            tmp[0] = Math.max(left[0] + right[0], root.val + left[1] + left[2] + right[1] + right[2]);
            tmp[1] = left[0];
            tmp[2] = right[0];
        }
        return tmp;
    }
}