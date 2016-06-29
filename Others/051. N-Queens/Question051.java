public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (n <= 0) return res;
        char[][] chess = new char[n][n];
        for (char[] row : chess) {
            Arrays.fill(row, '.');
        }
        boolean[] blocked = new boolean[n];
        dfs(res, chess, blocked, 0, n);
        return res;
    }
    private void dfs(List<List<String>> res, char[][] chess, boolean[] blocked, int r, int n) {
        if (r == n) {
            List<String> list = new ArrayList<String>();
            for (char[] row : chess) {
                list.add(new String(row));
            }
            res.add(list);
            return;
        }
        for (int c = 0; c < n; c++) {
            if (isValid(chess, blocked, r, c, n)) {
                chess[r][c] = 'Q';
                blocked[c] = true;
                dfs(res, chess, blocked, r + 1, n);
                chess[r][c] = '.';
                blocked[c] = false;
            }
        }
    }
    private boolean isValid(char[][] chess, boolean[] blocked, int r, int c, int n) {
        if (blocked[c]) return false;
        for (int i = 1; r - i >= 0 && c - i >= 0; i++) {
            if (chess[r - i][c - i] == 'Q') return false;
        }
        for (int i = 1; r - i >= 0 && c + i < n; i++) {
            if (chess[r - i][c + i] == 'Q') return false;
        }
        return true;
    }
}