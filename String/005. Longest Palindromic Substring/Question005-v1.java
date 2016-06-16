public class Solution {
    /* Expand from center; 
       A string with length N has 2N - 1 centers;
       O(N) time and O(1) space;
    */
    public String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String s1 = expand(s, i, i);
            if (s1.length() > res.length()) res = s1;
            String s2 = expand(s, i, i + 1);
            if (s2.length() > res.length()) res = s2;
        }
        return res;
    }
    private String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}