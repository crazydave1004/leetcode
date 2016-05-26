public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int l = 0;
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[l + 1] = nums[i];
            if (nums[i] == nums[l]) {
                c++;
                if (c < 3) l++;
            } else {
                l++;
                c = 1;
            }
        }
        return l + 1;
    }
}