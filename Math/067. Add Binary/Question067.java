public class Solution {
    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        String res = "";
        int carry = 0;
        int i = 0;
        while (i < a.length() || i < b.length()) {
            int n1 = i < a.length() ? a.charAt(i) - '0' : 0;
            int n2 = i < b.length() ? b.charAt(i) - '0' : 0;
            int s = n1 + n2 + carry;
            carry = s / 2;
            res = s % 2 + res;
            i++;
        }
        return carry == 0 ? res : "1" + res;
    }
}