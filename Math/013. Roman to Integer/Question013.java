public class Solution {
    public int romanToInt(String s) {
        int[] n = new int[255];
        n['I'] = 1; n['V'] = 5; n['X'] = 10; n['L'] = 50; n['C'] = 100; n['D'] = 500; n['M'] = 1000;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && n[s.charAt(i)] > n[s.charAt(i - 1)]) {
                res += n[s.charAt(i)] - 2 * n[s.charAt(i - 1)];
            } else {
                res += n[s.charAt(i)];
            }
        }
        return res;
    }
}