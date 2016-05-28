public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int left = 0, right = 0, sum = 0;
        int res = Integer.MAX_VALUE;
        while (true) {
            if (sum >= s) {
                int len = right - left;
                if (len == 1) return len;
                if (len < res) {
                    res = len;
                }
                if (left >= nums.length) break;
                sum -= nums[left];
                left++;
            } else {
                if (right >= nums.length) break;
                sum += nums[right];
                right++;
            }
        }
        if (res == Integer.MAX_VALUE) return 0;
        return res;
    }
}