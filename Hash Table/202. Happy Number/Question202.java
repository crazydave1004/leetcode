public class Solution {
    public boolean isHappy(int n) {
        boolean[] visited = new boolean[729];
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum += rem * rem;
            }
            if (visited[sum]) break;
            visited[sum] = true;
            n = sum;
        }
        if (n == 1) return true;
        return false;
    }
}