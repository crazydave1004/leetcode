public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        List<TreeNode> nlist = new ArrayList<TreeNode>();
        nlist.add(root);
        while (nlist.size() != 0) {
            int l = nlist.size();
            List<Integer> tlist = new ArrayList<Integer>();
            for (int i = 0; i < l; i++) {
                TreeNode node = nlist.get(i);
                tlist.add(node.val);
                if (node.left != null) nlist.add(node.left);
                if (node.right != null) nlist.add(node.right);
            }
            res.add(0, tlist);
            for (int i = 0; i < l; i++) {
                nlist.remove(0);
            }
        }
        return res;
    }
}