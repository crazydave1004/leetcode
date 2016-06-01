public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int low = 1, high = x / 2;
        while (low < high) {
            int mid = low + (high - low) / 2 + 1;
            if (mid > x / mid) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return low;
    }
}