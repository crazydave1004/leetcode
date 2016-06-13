public class Solution {
    private Queue<Integer> queue = new LinkedList<Integer>();
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') infection(board, i, 0);
            if (board[i][n - 1] == 'O') infection(board, i, n - 1);
        }
        for (int j = 1; j < n - 1; j++) {
            if (board[0][j] == 'O') infection(board, 0, j);
            if (board[m - 1][j] == 'O') infection(board, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    private void infection(char[][] board, int i, int j) {
        fill(board, i, j);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            i = cur / board[0].length;
            j = cur % board[0].length;
            fill(board, i - 1, j);
            fill(board, i + 1, j);
            fill(board, i, j - 1);
            fill(board, i, j + 1);
        }
    }
    private void fill(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') return;
        queue.offer(i * board[0].length + j);
        board[i][j] = '#';
    }
}