public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int l = nums.length;
        if (l == 1) return nums[0];
        if (l == 2) return Math.max(nums[0], nums[1]);
        int[] sum = new int[l - 1];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < l - 1; i++) {
            sum[i] = Math.max(sum[i - 2] + nums[i], sum[i - 1]);
        }
        int[] sum2 = new int[l - 1];
        sum2[0] = nums[1];
        sum2[1] = Math.max(nums[1], nums[2]);
        for (int i = 2; i < l - 1; i++) {
            sum2[i] = Math.max(sum2[i - 2] + nums[i + 1], sum2[i - 1]);
        }
        return Math.max(sum[l - 2], sum2[l - 2]);
    }
}