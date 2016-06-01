public class Solution {
    public String multiply(String num1, String num2) {
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();
        int[] val = new int[n1.length() + n2.length()];
        for (int i = 0; i < n1.length(); i++) {
            int a = n1.charAt(i) - '0';
            for (int j = 0; j < n2.length(); j++) {
                int b = n2.charAt(j) - '0';
                val[i + j] += a * b;
            }
        }
        int carry = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < val.length; i++) {
            int tmp = val[i] + carry;
            val[i] = tmp % 10;
            res.insert(0, val[i]);
            carry =  tmp / 10;
        }
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        return res.length() == 0 ? "0" : res.toString();
    }
}