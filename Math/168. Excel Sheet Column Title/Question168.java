public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            res.append((char) ('A' + (n - 1) % 26));
            n = (n - 1) / 26;
        }
        return res.reverse().toString();
    }
}