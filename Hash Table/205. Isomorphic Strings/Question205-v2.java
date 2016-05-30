public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        if (s1.length != s2.length) return false;
        char[] arr1 = new char[256];
        char[] arr2 = new char[256];
        for (int i = 0; i < s.length(); i++) {
            if (arr1[s1[i]] == 0 && arr2[s2[i]] == 0) {
                arr1[s1[i]] = s2[i];
                arr2[s2[i]] = s1[i];
            } else {
                if (arr1[s1[i]] != s2[i] || arr2[s2[i]] != s1[i]) return false;
            }
        }
        return true;
    }
}