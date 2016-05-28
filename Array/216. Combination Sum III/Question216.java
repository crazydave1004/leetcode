public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n == 0) return res;
        List<Integer> list = new ArrayList<Integer>();
        helper(res, list, k, n, 0, 1);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int k, int n, int sum, int start) {
        if (k == 0) {
            if (sum == n) res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = start; i <= 9; i++) {
            list.add(i);
            sum += i;
            helper(res, list, k - 1, n, sum, i + 1);
            sum -= i;
            list.remove(list.size() - 1);
        }
        return;
    }
}