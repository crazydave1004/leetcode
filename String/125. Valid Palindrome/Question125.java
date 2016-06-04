public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!(Character.isDigit(s.charAt(left)) || Character.isLetter(s.charAt(left)))) {
                left++;
            } else if (!(Character.isDigit(s.charAt(right)) || Character.isLetter(s.charAt(right)))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}