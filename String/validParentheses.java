class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0){
            return true;
        }
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='[' ||x=='{'|| x=='('){
                stk.push(x);
                continue;
            }
            if(stk.isEmpty()){
                return false;
            }
            switch(x){
                case ')':
                    char y = stk.pop();
                    if(y=='{'|| y =='['){
                        return false;
                    }
                    break;
                case ']':
                    y = stk.pop();
                    if(y=='{'|| y =='('){
                        return false;
                    }
                    break;
                case '}':
                    y = stk.pop();
                    if(y=='('|| y =='['){
                        return false;
                    }
                    break;
            }
        }
        return stk.isEmpty();
    }
}
