class MinStack {

    /** initialize your data structure here. */
    private List<int[]> list;
    private int min;
    public MinStack() {
        list = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        min = Math.min(min, x);
        list.add(new int[] {x, min});
    }
    
    public void pop() {
		list.remove(list.size() - 1);
        if (list.isEmpty()) {
            min = Integer.MAX_VALUE;
        }
        else {
            min = list.get(list.size() - 1)[1];
        }
    }
    
    public int top() {
        return list.get(list.size() - 1)[0];
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
