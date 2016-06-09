public class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack = new Stack<String>();
        String[] s = preorder.split(",");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("#")) {
                while (!stack.isEmpty() && stack.peek().equals("#")) {
                    stack.pop();
                    if (stack.isEmpty()) return false;
                    stack.pop();
                }
                stack.push(s[i]);
            } else {
                stack.push(s[i]);
            }
        }
        if (!stack.pop().equals("#")) return false;
        return stack.isEmpty();
    }
}