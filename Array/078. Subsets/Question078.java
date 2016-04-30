public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        res.add(list);
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        helper(res, new ArrayList<Integer>(list), nums, 0);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            res.add(new ArrayList<Integer>(list));
            helper(res, new ArrayList<Integer>(list), nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}