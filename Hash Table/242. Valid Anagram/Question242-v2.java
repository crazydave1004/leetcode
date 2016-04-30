public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String str1 = new String(c1);
        String str2 = new String(c2);
        if (str1.equals(str2)) return true;
        return false;
    }
}