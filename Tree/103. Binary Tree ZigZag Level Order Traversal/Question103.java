public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        List<TreeNode> nList = new ArrayList<TreeNode>();
        nList.add(root);
        boolean reverse = false;
        while (!nList.isEmpty()) {
            int l = nList.size();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < l; i++) {
                TreeNode node = nList.get(i);
                list.add(node.val);
                if (node.left != null) nList.add(node.left);
                if (node.right != null) nList.add(node.right);
            }
            if (reverse) {
                Collections.reverse(list);
                reverse = false;
            } else {
                reverse = true;
            }
            res.add(list);
            for (int i = 0; i < l; i++) {
                nList.remove(0);
            }
        }
        return res;
    }
}