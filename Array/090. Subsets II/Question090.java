public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        res.add(list);
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        helper(res, list, 0, nums);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int start, int[] nums) {
        for (int i = start; i < nums.length; i++) {
            if (i != start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            res.add(new ArrayList<Integer>(list));
            helper(res, new ArrayList<Integer>(list), i + 1, nums);
            list.remove(list.size() - 1);
        }
    }
}