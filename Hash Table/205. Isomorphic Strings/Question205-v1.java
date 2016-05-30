public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> hash = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                if (!hash.get(s.charAt(i)).equals(t.charAt(i))) return false;
            } else {
                if (hash.containsValue(t.charAt(i))) return false;
                hash.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}