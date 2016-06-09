public class MinStack {
    Stack<Integer> value;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        value = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int x) {
        value.push(x);
        if (min.isEmpty() || x <= getMin()) min.push(x);
    }
    
    public void pop() {
        if (getMin() == value.pop()) min.pop();
    }
    
    public int top() {
        return value.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}