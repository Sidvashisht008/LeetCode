class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && (c>='A' && c<='Z') && (stack.peek()==Character.toLowerCase(c)))
                stack.pop();
            else  if(!stack.isEmpty() && (c>='a' && c<='z') && (stack.peek()==Character.toUpperCase(c)))
                stack.pop();
            else
                stack.push(c);
        }
        
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty())
            res.insert(0,stack.pop());
        
        return res.toString();
    }
}
