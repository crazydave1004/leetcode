public class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        if (l == 1) return 0;
        int profit = 0;
        for (int i = 1; i < l; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}