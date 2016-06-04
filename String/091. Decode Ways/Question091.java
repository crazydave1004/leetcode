public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;
        if (s.length() == 1) return 1;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < s.length(); i++) {
            //"00" cannot be decoded
            if (s.charAt(i) == '0' && s.charAt(i - 1) == '0') return 0;
            if (s.charAt(i - 1) == '0') {
                dp[i + 1] = dp[i];
            } else if (s.charAt(i) == '0') {
                if (Integer.parseInt(s.substring(i - 1, i + 1)) > 26) return 0;
                dp[i + 1] = dp[i - 1];
            } else if (Integer.parseInt(s.substring(i - 1, i + 1)) < 27) {
                dp[i + 1] = dp[i] + dp[i - 1];
            } else {
                dp[i + 1] = dp[i];
            }
        }
        return dp[s.length()];
    }
}