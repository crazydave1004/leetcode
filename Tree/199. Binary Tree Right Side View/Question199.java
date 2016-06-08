public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        dfs(res, root, 1);
        return res;
    }
    
    private void dfs(List<Integer> res, TreeNode root, int layer){
        if(root == null) return;
        if(layer > res.size()) res.add(root.val);
        dfs(res, root.right, layer+1);
        dfs(res, root.left, layer+1);
    }
}