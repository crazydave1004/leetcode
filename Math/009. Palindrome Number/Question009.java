public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long lx = x;
        long nx = 0;
        while (lx > 0) {
            nx = nx * 10 + lx % 10;
            lx /= 10;
        }
        return x == nx;
    }
}