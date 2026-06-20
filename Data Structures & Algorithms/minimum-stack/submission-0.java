class MinStack {
    Stack<Integer> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int minValue = st.peek();
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty())
        {
            minValue = Math.min(st.peek(), minValue);
            temp.push(st.pop());
        }

        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }
        return minValue;
    }
}
