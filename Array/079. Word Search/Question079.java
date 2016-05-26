public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        if (m == 0 || word == null || word.length() == 0) return false;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visited)) return true;
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int p, int i, int j, boolean[][] visited) {
        if (p == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (visited[i][j]) return false;
        if (board[i][j] != word.charAt(p)) return false;
        visited[i][j] = true;
        boolean res = dfs(board, word, p + 1, i, j + 1, visited) || dfs(board, word, p + 1, i, j - 1, visited) || dfs(board, word, p + 1, i - 1, j, visited) || dfs(board, word, p + 1, i + 1, j, visited);
        visited[i][j] = false;
        return res;
        
    }
}