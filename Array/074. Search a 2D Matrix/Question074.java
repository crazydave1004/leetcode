public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = n * m - 1, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            int mid2D = matrix[mid / n][mid % n];
            if (mid2D == target) {
                return true;
            } else if (mid2D < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}