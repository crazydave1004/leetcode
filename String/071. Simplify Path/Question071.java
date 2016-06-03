public class Solution {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) return null;
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(".") || arr[i].equals("")) {
                continue;
            } else if (!arr[i].equals("..")) {
                stack.push(arr[i]);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder res = new StringBuilder();
        Stack<String> tmp = new Stack<String>();
        while (!stack.isEmpty()) {
            tmp.push(stack.pop());
        }
        while (!tmp.isEmpty()) {
            res.append("/");
            res.append(tmp.pop());
        }
        if (res.length() == 0) return "/";
        return res.toString();
    }
}