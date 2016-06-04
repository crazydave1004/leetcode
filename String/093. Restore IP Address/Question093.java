public class Solution {
    public List<String> restoreIpAddresses(String s) {
        int l = s.length();
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < 3 && i < l - 3; i++) {
            for (int j = i + 1; j < i + 4 && j < l - 2; j++) {
                for (int k = j + 1; k < j + 4 && k < l - 1; k++) {
                    String s1 = s.substring(0, i + 1);
                    String s2 = s.substring(i + 1, j + 1);
                    String s3 = s.substring(j + 1, k + 1);
                    String s4 = s.substring(k + 1);
                    if (s4.length() > 3) continue;
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        res.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return res;
    }
    private boolean isValid(String s) {
        Integer a = Integer.parseInt(s);
        //compareTo() compares two strings (return 0 if equals)
        return a.toString().compareTo(s) == 0 && a < 256;
    }
}