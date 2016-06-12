public class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] element = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                element[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((element[i] & element[j]) == 0)
                    res = Math.max(res, words[i].length() * words[j].length());
            }
        }
        return res;
    }
}