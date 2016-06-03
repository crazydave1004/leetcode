public class Solution {
    public String countAndSay(int n) {
        String s = new String("1");
        for (int i = 1; i < n; i++) {
            char[] arr = s.toCharArray();
            int count = 1;
            char tmp = arr[0];
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == tmp) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(tmp);
                    tmp = arr[j];
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(tmp);
            s = sb.toString();
        }
        return s;
    }
}