public class Solution {
    public int strStr(String s, String p) {
        if (s == null || p == null || p.length() == 0) return 0;
        if (s.length() < p.length()) return -1;
        int[] next = nextArray(p);
        int i = 0;
        while (i <= s.length() - p.length()) {
            boolean match = true;
            for (int j = 0; j < p.length(); j++) {
                if (s.charAt(i) != p.charAt(0)) {
                    match = false;
                    i++;
                    break;
                }
                if (s.charAt(i + j) != p.charAt(j)) {
                    i = i + j - next[j - 1];
                    match = false;
                    break;
                }
            }
            if (match) return i;
        }
        return -1;
    }
    private int[] nextArray(String p) {
        int[] next = new int[p.length()];
        next[0] = 0;
        for (int i = 1; i < p.length(); i++) {
            int index = next[i - 1];
            while (index > 0 && p.charAt(index) != p.charAt(i)) index = next[index - 1];
            if (p.charAt(index) == p.charAt(i)) {
                next[i] = next[i - 1] + 1;
            } else {
                next[i] = 0;
            }
        }
        return next;
    }
}