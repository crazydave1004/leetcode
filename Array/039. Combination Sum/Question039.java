public class Solution {
    public List<List<Integer>> combinationSum(int[] A, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (A == null || A.length == 0) return res;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(A);
        helper(res, list, 0, A, target);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int start, int[] A, int target) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(list));
            return;
        } 
        for (int i = start; i < A.length; i++) {
            if (i > start && A[i] == A[i - 1]) continue;
            int tmp = target - A[i];
            if (tmp < 0) break;
            list.add(A[i]);
            helper(res, list, i, A, tmp);
            list.remove(list.size() - 1);
        }
    }
}