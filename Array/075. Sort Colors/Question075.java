public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int redTail = 0, blueHead = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, i, redTail);
                redTail++;
            }
        }
        for (int i = blueHead; i >= redTail; i--) {
            if (nums[i] == 2) {
                swap(nums, i, blueHead);
                blueHead--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}