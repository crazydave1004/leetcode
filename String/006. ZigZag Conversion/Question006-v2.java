public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[] arr = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            int n = r;
            boolean flag = true;
            while (n < arr.length) {
                res.append(arr[n]);
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
        return res.toString();
    }
}