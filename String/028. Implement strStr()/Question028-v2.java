public class Solution {
    public int strStr(String S, String W) {
        if (W.length() == 0) return 0;
        if (S.length() < W.length()) return -1;
        int[] T = new int[W.length()];
        int p = 2;
        int c = 0;
        T[0] = -1;
        if (W.length() > 1) T[1] = 0;
        while (p < W.length()) {
            if (W.charAt(p - 1) == W.charAt(c)) {
                T[p] = c + 1;
                c++;
                p++;
            } else if (c > 0) {
                c = T[c];
            } else {
                T[p] = 0;
                p++;
            }
        }
        int i = 0;
        int m = 0;
        while ((m + i) < S.length()) {
            if (S.charAt(m + i) == W.charAt(i)) {
                if (i == W.length() - 1) return m;
                i++;
            } else {
                if (T[i] > -1) {
                    m = m + i - T[i];
                    i = T[i];
                } else {
                    m++;
                    i = 0;
                }
            }
        }
        return -1;
    }
}