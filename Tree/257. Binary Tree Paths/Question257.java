public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if (root == null) return list;
        helper(list, root, new StringBuilder());
        return list;
    }
    public void helper(List<String> list, TreeNode root, StringBuilder path) {
        path.append(root.val);
        if (root.left == null && root.right == null) {
            String res = path.toString();
            list.add(res);
            return;
        }
        if (root.left != null) {
            path.append("->");
            int index = path.length() - 2;
            helper(list, root.left, path);
            path.delete(index, path.length());
        }
        if (root.right != null) {
            path.append("->");
            int index = path.length() - 2;
            helper(list, root.right, path);
            path.delete(index, path.length());
        }
    }
}