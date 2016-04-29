public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 1;
        for (int i = 0; i < reach && reach < n; ++i)
            reach = Math.max(reach, i + 1 + nums[i]);
        return reach >= n;
    }
}