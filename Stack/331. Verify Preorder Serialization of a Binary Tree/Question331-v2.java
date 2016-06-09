public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] s = preorder.split(",");
        int a = 0, b = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].equals("#")) {
                a++;
            } else {
                b++;
            }
            if (a - b < 1) return false;
        }
        return a - b == 1;
    }
}