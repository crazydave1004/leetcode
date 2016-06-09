class MyQueue {
    
    Stack<Integer> major = new Stack<Integer>();
    Stack<Integer> minor = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        if (major.isEmpty()) {
            major.push(x);
        } else {
            while (!major.isEmpty()) {
                minor.push(major.pop());
            }
            major.push(x);
            while (!minor.isEmpty()) {
                major.push(minor.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        major.pop();
    }

    // Get the front element.
    public int peek() {
        return major.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return major.isEmpty();
    }
}