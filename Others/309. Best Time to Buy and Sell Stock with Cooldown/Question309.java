public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int b1 = - prices[0], s1 = 0, s2 = 0;
        for (int i = 1; i < prices.length; i++) {
            int b0 = Math.max(b1, s2 - prices[i]);
            int s0 = Math.max(s1, b1 + prices[i]);
            b1 = b0;
            s2 = s1;
            s1 = s0;
        }
        return s1;
    }
}