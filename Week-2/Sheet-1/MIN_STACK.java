package Week2;

import java.util.Stack;

public class MIN_STACK {

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.getMin()); // -3
        
        ms.pop();
        System.out.println(ms.top());    // 0
        System.out.println(ms.getMin()); // -2
    }

    static class MinStack {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minSt = new Stack<>();

        public void push(int val) {
            st.push(val);
            if (minSt.isEmpty() || val <= minSt.peek()) {
                minSt.push(val);
            }
        }

        public void pop() {
            if (st.peek().equals(minSt.peek())) {
                minSt.pop();
            }
            st.pop();
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return minSt.peek();
        }
    }
}
