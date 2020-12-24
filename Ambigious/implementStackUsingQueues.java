class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    boolean useQueue1;       //queue2 used fro top
    boolean useQueue2;      //queue1 used for top
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
        useQueue1 = true;
        useQueue2 = false;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(useQueue1){
            if(!queue2.isEmpty())
                queue1.add(queue2.poll());
            queue2.add(x);
        }
        else{
            if(!queue1.isEmpty())
                queue2.add(queue1.poll());
            queue1.add(x);
        }
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        int result = 0;
        if(useQueue1){
            
            result = queue2.poll();
            while(queue1.size() > 1){
                queue2.add(queue1.poll());
            }
            
            useQueue1 = false;
            useQueue2 = true;
        }
        else{
            
            result = queue1.poll();
            while(queue2.size() > 1){
                queue1.add(queue2.poll());
            }
            
            useQueue1 = true;
            useQueue2 = false;
        }
        
        return result;
        
    }
    
    /** Get the top element. */
    public int top() {
        
        if(useQueue1)
            return queue2.peek();
        else
            return queue1.peek();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty())
            return true;
        else
            return false;
    }
}
