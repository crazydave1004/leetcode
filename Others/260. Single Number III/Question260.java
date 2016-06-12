public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int x = 0;
        for (int num : nums) x ^= num;
        x = x & (~(x - 1));
        for (int num : nums) {
            if ((num & x) != 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }
}