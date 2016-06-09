class MyStack {
    Queue<Integer> major = new LinkedList<Integer>();
    Queue<Integer> minor = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        if (major.isEmpty()) {
            major.offer(x);
        } else {
            while (!major.isEmpty()) {
                minor.offer(major.poll());
            }
            major.offer(x);
            while (!minor.isEmpty()) {
                major.offer(minor.poll());
            }
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        major.poll();
    }

    // Get the top element.
    public int top() {
        return major.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return major.isEmpty();
    }
}