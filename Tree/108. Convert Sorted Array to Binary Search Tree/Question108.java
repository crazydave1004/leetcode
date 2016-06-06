public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }
    
    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;
        TreeNode node = new TreeNode(nums[(left + right) / 2]);
        node.left = helper(nums, left, (left + right) / 2 -1);
        node.right = helper(nums, (left + right) / 2 + 1, right);
        return node;
    }
}