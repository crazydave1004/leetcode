public class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        int carry = 0;
        for (int i = 1;i <= l; i++) {
            if ((digits[l - i] + 1) < 10) {
                digits[l - i] = digits[l - i] + 1;
                carry = 0;
                break;
            }else{
                digits[l - i] = digits[l - i] - 9 ;
                carry = 1;
            }
        }
        if (carry == 0) return digits;
        else {
             int[] res = new int[l + 1];
             res[0] = 1;
             for (int i = 1; i < l + 1; i++) res[i] = 0;
             return res;
        }
    }
}