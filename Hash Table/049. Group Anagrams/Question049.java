public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0) return res;
        HashMap<String, List<String>> hash = new HashMap<String, List<String>>();
        for (String s : strs) {
            //toCharArray() converts a string to an array of char value
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if (hash.containsKey(str)) {
                hash.get(str).add(s);
            } else {
                List<String> list = new ArrayList<String>();
                list.add(s);
                hash.put(str, list);
            }
        }
        for (String key : hash.keySet()) {
            List<String> tmp = hash.get(key);
            Collections.sort(tmp);
            res.add(tmp);
        }
        return res;
    }
}