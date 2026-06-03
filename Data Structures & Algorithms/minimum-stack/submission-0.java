class MinStack {
Stack<Integer> s;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        int min=s.peek();
        Stack<Integer> tempStack=new Stack<>();
        while(!s.isEmpty()){
min=Math.min(min,s.peek());
tempStack.push(s.pop());
        }
        while(!tempStack.isEmpty()){
            s.push(tempStack.pop());
        }
        return min;
        
    }
}
