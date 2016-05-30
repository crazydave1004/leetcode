public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        if (s.length() <= 10) return res;
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        for (int i = 10; i <= s.length(); i++) {
            String str = s.substring(i - 10, i);
            if (hash.containsKey(str)) {
                if (hash.get(str) == 1) {
                    res.add(str);
                    int count = hash.get(str);
                    hash.put(str, count + 1);
                }
            } else {
                hash.put(str, 1);
            }
        }
        return res;
    }
}