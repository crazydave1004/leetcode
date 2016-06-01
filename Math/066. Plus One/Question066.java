public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                digits[i] = digits[i] + 1;
                carry = 0;
                break;
            } else {
                digits[i] = digits[i] - 9;
                carry = 1;
            }
        }
        if (carry == 0) return digits;
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            res[i + 1] = digits[i];
        }
        return res;
    }
}