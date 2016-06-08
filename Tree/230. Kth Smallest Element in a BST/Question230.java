public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        int c = 1;
        TreeNode cur = new TreeNode(0);
        while (!stack.isEmpty() && c <= k) {
            cur = stack.pop();
            c++;
            TreeNode node = cur.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return cur.val;
    }
}