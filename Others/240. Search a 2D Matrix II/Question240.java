public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int j = n - 1;
        for (int i = 0; i < m; i++) {
            while (j > 0 && matrix[i][j] > target) {
                j--;
            }
            if (matrix[i][j] == target) return true; 
        }
        return false;
    }
}