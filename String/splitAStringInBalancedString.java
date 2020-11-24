class Solution {
    public int balancedStringSplit(String s) {
        int Rcount = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                Rcount++;
            }
            else{
                Rcount--;
            }
            if(Rcount == 0){
                res++;
            }
        }
        return res;
    }
}
