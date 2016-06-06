public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        helper(res, root, new ArrayList<Integer>(), sum);
        return res;
    }
    
    public void helper(List<List<Integer>> res, TreeNode root, List<Integer> path, int sum) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (root.val == sum) res.add(new ArrayList<Integer>(path));
            return;
        }
        if (root.left != null) {
            helper(res, root.left, path, sum - root.val);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            helper(res, root.right, path, sum - root.val);
            path.remove(path.size() - 1);
        }
    }
}