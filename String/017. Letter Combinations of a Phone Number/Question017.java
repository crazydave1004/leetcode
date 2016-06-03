public class Solution {
    String[] letters = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits == null || digits.length() == 0) return res;
        char[] arr = digits.toCharArray();
        StringBuilder sb = new StringBuilder();
        dfs(res, sb, arr, 0);
        return res;
    }
    private void dfs(List<String> res, StringBuilder sb, char[] arr, int start) {
        if (start >= arr.length) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < letters[arr[start] - '0'].length(); i++) {
            sb.append(letters[arr[start] - '0'].charAt(i));
            dfs(res, sb, arr, start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}