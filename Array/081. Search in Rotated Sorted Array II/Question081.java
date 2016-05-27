public class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] > target) {
                if (nums[mid] < nums[right]) {
                    right = mid - 1;
                } else if (nums[mid] == nums[right]) {
                    right--;
                } else {
                    if (nums[left] < target) {
                        right = mid - 1;
                    } else if (nums[left] > target) {
                        left = mid + 1;
                    } else {
                        return true;
                    }
                }
            } else {
                if (nums[mid] > nums[left]) {
                    left = mid + 1;
                } else if (nums[mid] == nums[left]) {
                    left++;
                } else {
                    if (nums[right] > target) {
                        left = mid + 1;
                    } else if (nums[right] < target) {
                        right = mid - 1;
                    } else {
                        return true;
                    }
                }
            }
        }
        if (nums[left] == target) return true;
        return false;
    }
}