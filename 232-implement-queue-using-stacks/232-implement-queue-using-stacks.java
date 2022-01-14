class MyQueue {

    Stack<Integer> st1= null;
    Stack<Integer> st2= null;
    
    public MyQueue() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    public  void push(int x) {
            st1.push(x);
    }
    
    public int pop() {
        int temp=0;
        if(!st1.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            temp = st2.pop();
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        return temp;
    }
    
    public int peek() {
                int temp=0;
        if(!st1.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            temp = st2.peek();
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        return temp;
    }
    
    public boolean empty() {
        if(st1.isEmpty() && st2.isEmpty())  return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */