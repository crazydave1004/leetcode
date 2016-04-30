public class Solution {
    public void setZeroes(int[][] A) {
        int m = A.length;
        if (m == 0) return;
        int n = A[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (rows[i] == 1) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (cols[j] == 1) {
                for (int i = 0; i < m; i++) {
                    A[i][j] = 0;
                }
            }
        }
    }
}