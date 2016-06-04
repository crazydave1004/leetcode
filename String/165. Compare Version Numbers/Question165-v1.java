public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("[.]");
        String[] v2 = version2.split("[.]");
        int i = 0;
        while (i < v1.length || i < v2.length) {
            int p1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int p2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (p1 == p2) {
                i++;
            } else if (p1 > p2) {
                return 1;
            } else if (p1 < p2) {
                return -1;
            }
        }
        return 0;
    }
}