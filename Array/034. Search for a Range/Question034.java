public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                res[0] = left;
                res[1] = right;
                return res;
            }
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                if (nums[left] == target) right--;
                else left++;
            }
        }
        return res;
    }
}