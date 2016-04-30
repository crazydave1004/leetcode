public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] arr = s.toCharArray();
        int[] p = new int[255];
        int start = 0, max = 0;
        int i = 0;
        for (; i < s.length(); i++) {
            char c = arr[i];
            if (p[c] >= start) {
                    max = Math.max(max, i + 1 - start);
                    start = p[c] + 1;
                    if (s.length() + 1 - start <= max) break;
            }
            p[c] = i + 1;
        }
        return Math.max(max, i + 1 - start);
    }
}