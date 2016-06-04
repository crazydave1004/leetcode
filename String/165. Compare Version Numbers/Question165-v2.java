public class Solution {
    public int compareVersion(String version1, String version2) {
        return helper(version1, version2);
    }
    private int helper(String version1, String version2) {
        int p1 = version1.indexOf('.');
        int p2 = version2.indexOf('.');
        int s1 = 0, s2 = 0;
        if (p1 != -1) {
            s1 = Integer.parseInt(version1.substring(0, p1));
        } else {
            s1 = Integer.parseInt(version1);
        }
        if (p2 != -1) {
            s2 = Integer.parseInt(version2.substring(0, p2));
        } else {
            s2 = Integer.parseInt(version2);
        }
        if (s1 > s2) {
            return 1;
        } else if (s1 < s2) {
            return -1;
        } else {
            if (p1 == -1 && p2 == -1) {
                return 0;
            } else if (p1 == -1) {
                return helper("0", version2.substring(p2 + 1));
            } else if (p2 == -1) {
                return helper(version1.substring(p1 + 1), "0");
            } else {
                return helper(version1.substring(p1 + 1), version2.substring(p2 + 1));
            }
        } 
    }
}