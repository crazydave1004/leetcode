public class Solution {
    public int calculate(String s) {
        int lower = 0, sign = 1, higher = 0, num = 0, op = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                if (i == s.length() - 1 || !Character.isDigit(s.charAt(i + 1))) {
                    higher = op == 0 ? num : (op == 1 ? higher * num : higher / num);
                }
            } else if (s.charAt(i) == '*' || s.charAt(i) == '/') {
                op = s.charAt(i) == '*' ? 1 : -1;
                num = 0;
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                lower += sign * higher;
                sign = s.charAt(i) == '+' ? 1 : -1;
                op = 0;
                num = 0;
            }
        }
        return lower + sign * higher;
    }
}