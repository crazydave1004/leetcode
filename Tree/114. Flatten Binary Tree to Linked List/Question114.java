public class Solution {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (root == null) return;
        helper(root, list);
        int len = list.size();
        TreeNode node = root;
        for (int i = 1; i < len; i++) {
            node.left = null;
            node.right = list.get(i);
            node = node.right;
        }
        node.left = null;
        node.right = null;
    }
    
    private void helper(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        list.add(root);
        helper(root.left, list);
        helper(root.right, list);
    }
}