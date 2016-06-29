public class Solution {
    public String getPermutation(int n, int k) {
        int p = 1;
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            s.append(i);
            if (i != n) p *= i;
        }
        if (k == 1) return s.toString();
        int r = k;
        int b = 0;
        int c = 0;
        while (true) {
            b = (r - 1) / p;
            char tmp = s.charAt(b + c);
            s.deleteCharAt(b + c);
            s.insert(c, tmp);
            r -= b * p;
            if (n - c - 2 == 0) break;
            p = p / (n - c - 1);
            c++;
        }
        return s.toString();
    }
}