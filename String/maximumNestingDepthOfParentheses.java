class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int current = 0;
        for(char c: s.toCharArray()){
            if(c=='(')
                current += 1;
            else if(c==')'){
                max = Math.max(max, current);
                current -= 1;
            }
        }
        return max;
    }
}
