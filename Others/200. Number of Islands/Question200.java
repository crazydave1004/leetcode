public class Solution {
    private Queue<Integer> queue = new LinkedList<Integer>();
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    expansion(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void expansion(char[][] grid, int i, int j) {
        fill(grid, i, j);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            i = current / grid[0].length;
            j = current % grid[0].length;
            fill(grid, i - 1, j);
            fill(grid, i + 1, j);
            fill(grid, i, j - 1);
            fill(grid, i, j + 1);
        }
        
    }
    private void fill(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
        queue.offer(i * grid[0].length + j);
        grid[i][j] = '#';
    }
}