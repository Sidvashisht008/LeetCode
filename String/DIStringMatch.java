class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] res = new int[S.length()+1];
        int lo = 0;
        int hi = N;
        for(int i = 0;i<N;i++){
            if(S.charAt(i)=='I'){
                res[i] = lo++;
            }else{
                res[i] = hi--;
            }
        }
        res[N] = lo;
        return res;
    }
}
