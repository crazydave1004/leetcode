public class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        dfs(n, 0, 0, 0, 0);
        return count;
    }
    private void dfs(int n, int r, int column, int diag, int antidiag) {
        if (r == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean col_ok = ((1 << i) & column) == 0;
            boolean diag_ok = ((1 << (n - 1 + r - i)) & diag) == 0;
            boolean antidiag_ok = ((1 << (r + i)) & antidiag) == 0;
            if (col_ok && diag_ok && antidiag_ok) {
                dfs(n, r + 1, (1 << i) | column, (1 << (n - 1 + r - i)) | diag, (1 << (r + i)) | antidiag);
            }
        }
    }
}