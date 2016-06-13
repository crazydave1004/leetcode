public class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = res.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[i] > res.get(mid)) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (left >= res.size()) {
                res.add(nums[i]);
            } else {
                res.set(left, nums[i]);
            }
        }
        return res.size();
    }
}