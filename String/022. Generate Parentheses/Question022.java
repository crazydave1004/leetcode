public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if (n == 0) return res;
        String s = new String();
        dfs(res, s, n, n);
        return res;
    }
    private void dfs(List<String> res, String s, int left, int right) {
        if (left > right) return;
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > 0) dfs(res, s + '(', left - 1, right);
        if (right > 0) dfs(res, s + ')', left, right - 1);
    }
}