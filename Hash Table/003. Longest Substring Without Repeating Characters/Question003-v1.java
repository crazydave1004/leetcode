public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        int start = 0, max = 0;
        int i = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hash.containsKey(c) && hash.get(c) >= start) {
                    max = Math.max(max, i - start);
                    start = hash.get(c) + 1;
            }
            hash.put(c, i);
        }
        return Math.max(max, i - start);
    }
}