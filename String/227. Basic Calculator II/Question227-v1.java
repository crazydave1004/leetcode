public class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        Stack<Integer> op = new Stack<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        int start = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == ' ') continue;
            if (i == s.length() || !Character.isDigit(s.charAt(i))) {
                if (op.isEmpty()) {
                    stack.push(Integer.parseInt(s.substring(start, i).trim()));
                } else {
                    int tmp = op.pop();
                    if (tmp < 3) {
                        if (op.isEmpty()) {
                            stack.push(Integer.parseInt(s.substring(start, i).trim()));
                        } else {
                            int tmp2 = op.pop();
                            int n2 = stack.pop();
                            int n1 = stack.pop();
                            if (tmp2 == 1) {
                                stack.push(n1 + n2);
                            } else {
                                stack.push(n1 - n2);
                            }
                            stack.push(Integer.parseInt(s.substring(start, i).trim()));
                        }
                        op.push(tmp);
                    } else {
                        int n1 = stack.pop();
                        int n2 = Integer.parseInt(s.substring(start, i).trim());
                        if (tmp == 3) {
                            stack.push(n1 * n2);
                        } else if (tmp == 4) {
                            stack.push(n1 / n2);
                        }
                    }
                }
                if (i == s.length()) break;
                String operator = s.substring(i, i + 1);
                if (operator.equals("+")) {
                    op.push(1);
                } else if (operator.equals("-")) {
                    op.push(2);
                } else if (operator.equals("*")) {
                    op.push(3);
                } else if (operator.equals("/")) {
                    op.push(4);
                }
                start = i + 1;
            } else continue;
        }
        if (op.isEmpty()) return stack.pop();
        if (op.pop() == 1) {
            return stack.pop() + stack.pop();
        } else {
            return - stack.pop() + stack.pop();
        }
    }
}