public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length < 2) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int ll = 0, rr = 0;
            if (mid == nums.length - 1) {
                ll = nums[mid - 1];
                rr = Integer.MIN_VALUE;
            } else if (mid == 0) {
                ll = Integer.MIN_VALUE;
                rr = nums[mid + 1];
            } else {
                ll = nums[mid - 1];
                rr = nums[mid + 1];
            }
            if (nums[mid] > ll && nums[mid] > rr) {
                return mid;
            } else if (nums[mid] < rr) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}