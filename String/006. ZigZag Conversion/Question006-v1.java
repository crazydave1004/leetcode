public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String res = new String();
        for (int r = 0; r < numRows; r++) {
            int n = r;
            boolean flag = true;
            while (n < s.length()) {
                res += s.charAt(n);
                if (r == numRows - 1) {
                    flag = false;
                } else if (r == 0) {
                    flag = true;
                }
                if (flag) {
                    n += 2 * (numRows - r) - 2;
                    flag = false;
                } else {
                    n += 2 * (r + 1) - 2;
                    flag = true;
                }
            }
        }
        return res;
    }
}