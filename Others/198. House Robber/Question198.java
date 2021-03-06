public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int l = nums.length;
        if (l == 1) return nums[0];
        int[] sum = new int[l];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < l; i++) {
            sum[i] = Math.max(sum[i - 2] + nums[i], sum[i - 1]);
        }
        return sum[l - 1];
    }
}