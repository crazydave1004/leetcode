public class Solution {
    public String getHint(String secret, String guess) {
        String hint = new String();
        char[] hash = new char[10];
        int a = 0;
        for (int i = 0; i < secret.length(); i++) {
            int count = 0;
            char s = secret.charAt(i), g = guess.charAt(i);
            if (s == g) {
                count--;
                a++;
            }
            hash[s - '0'] += count + 1;
        }
        int b = 0;
        for (int i = 0; i < guess.length(); i++) {
            char g = guess.charAt(i);
            char s = secret.charAt(i);
            if (g != s && hash[g - '0'] > 0) {
                b++;
                hash[g - '0']--;
            }
        }
        return a + "A" + b + "B";
    }
}