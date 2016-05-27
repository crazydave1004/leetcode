public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode helper(int[] preorder, int p, int[] inorder, int start, int end) {
        if (p >= preorder.length || start > end) return null;
        TreeNode node = new TreeNode(preorder[p]);
        int i;
        for (i = end; i >= start; i--) {
            if (inorder[i] == preorder[p]) break;
        }
        node.left = helper(preorder, p + 1, inorder, start, i - 1);
        node.right = helper(preorder, p + i - start + 1, inorder, i + 1, end);
        return node;
    } 
}