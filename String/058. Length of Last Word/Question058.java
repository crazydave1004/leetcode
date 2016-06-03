public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.trim() == null || s.trim().length() == 0) return 0;
        s = s.trim();
        String last = s.substring(s.lastIndexOf(" ") + 1);
        return last.length();
    }
}