public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder, postorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode helper(int[] postorder, int p, int[] inorder, int start, int end) {
        if (p < 0 || start > end) return null;
        TreeNode node = new TreeNode(postorder[p]);
        int count;
        for (count = end; count >= start; count--) {
            if (inorder[count] == postorder[p]) break;
        }
        node.left = helper(postorder, p - end + count - 1, inorder, start, count - 1);
        node.right = helper(postorder, p - 1, inorder, count + 1, end);
        return node;
    } 
}