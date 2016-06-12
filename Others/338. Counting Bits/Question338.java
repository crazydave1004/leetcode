public class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        if (num >= 1) res[1] = 1;
        if (num >= 2) res[2] = 1;
        if (num >= 3) {
            for (int i = 3; i <= num; i++) {
                res[i] = res[i / 2] + res[i % 2];
            }
        }
        return res;
    }
}