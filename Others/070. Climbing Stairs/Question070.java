public class Solution {
    public int climbStairs(int n) {
        int[] res = {1, 1};
        for (int i = 2; i <= n; i++) {
            int tmp = res[0] + res[1];
            res[0] = res[1];
            res[1] = tmp;
        }
        return res[1];
    }
}