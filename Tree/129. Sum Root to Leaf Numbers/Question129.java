public class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return helper(0, root, new StringBuilder());
    }
    public int helper(int sum, TreeNode root, StringBuilder path) {
        path.append(root.val);
        if (root.left == null && root.right == null) {
            String res = path.toString();
            sum += Integer.parseInt(res);
            return sum;
        }
        if (root.left != null) {
            sum = helper(sum, root.left, path);
            path.deleteCharAt(path.length() - 1);
        }
        if (root.right != null) {
            sum = helper(sum, root.right, path);
            path.deleteCharAt(path.length() - 1);
        }
        return sum;
    }
}