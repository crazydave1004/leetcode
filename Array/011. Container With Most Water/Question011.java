public class Solution {
    public int maxArea(int[] height) {
        int res = 0, l = height.length;
        int left = 0, right = l - 1;
        while (left < right) {
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) left++;
            else right--;
        }
        return res;
    }
}