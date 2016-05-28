public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int tmp = 0;
        k = k % n;
        if (k != 0) {
            for (int i = 0; i < (n - k) / 2; i++) {
                tmp = nums[i];
                nums[i] = nums[n - k - i - 1];
                nums[n - k - i - 1] = tmp;
            }
            for (int i = n - k; i < n - k / 2; i++) {
                tmp = nums[i];
                nums[i] = nums[n - i + (n - k) - 1];
                nums[n - i + (n - k) - 1] = tmp;
            }
            for (int i = 0; i < n / 2; i++) {
                tmp = nums[i];
                nums[i] = nums[n - i - 1];
                nums[n - i - 1] = tmp;
            }
        }
    }
}