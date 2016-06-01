public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> hash = new HashMap<Character, String>();
        char[] patterns = pattern.toCharArray();
        String[] strs = str.split(" ");
        if (patterns.length != strs.length) return false;
        for (int i = 0; i < patterns.length; i++) {
            if (hash.containsKey(patterns[i])) {
                if (!hash.get(patterns[i]).equals(strs[i])) return false;
            } else {
                if (hash.containsValue(strs[i])) return false;
                hash.put(patterns[i], strs[i]);
            }
        }
        return true;
    }
}