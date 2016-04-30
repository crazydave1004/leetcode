public class Solution {
    public void setZeroes(int[][] A) {
        int m = A.length;
        if (m == 0) return;
        int n = A[0].length;
        int[] hasZero = new int[2];
        for (int i = 0; i < m; i++) {
            if (A[i][0] == 0) {
                hasZero[1] = 1;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (A[0][j] == 0) {
                hasZero[0] = 1;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (A[i][j] == 0) {
                    A[i][0] = 0;
                    A[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (A[i][0] == 0 || A[0][j] == 0) A[i][j] = 0;
            }
        }
        if (hasZero[0] == 1) {
            for (int j = 0; j < n; j++) {
                A[0][j] = 0;
            }
        }
        if (hasZero[1] == 1) {
            for (int i = 0; i < m; i++) {
                A[i][0] = 0;
            }
        }
    }
}