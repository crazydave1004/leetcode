public class Solution {
    public String getHint(String secret, String guess) {
        String hint = new String();
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        int a = 0;
        for (int i = 0; i < secret.length(); i++) {
            int count = 0;
            char s = secret.charAt(i), g = guess.charAt(i);
            if (s == g) {
                count--;
                a++;
            }
            if (hash.containsKey(s)) {
                hash.put(s, hash.get(s) + count + 1);
            } else {
                hash.put(s, count + 1);
            }
        }
        int b = 0;
        for (int i = 0; i < guess.length(); i++) {
            char g = guess.charAt(i);
            char s = secret.charAt(i);
            if (g != s && hash.containsKey(g)) {
                if (hash.get(g) > 0) {
                    b++;
                    int count = hash.get(g);
                    hash.put(g, count - 1);
                }
            }
        }
        return a + "A" + b + "B";
    }
}