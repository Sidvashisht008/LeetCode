class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int i = 0;
        int j = 1;
        for(int x:A){
            if(x%2==0){
                res[i] = x;
                i+=2;
            }else{
                res[j] = x;
                j+=2;
            }
        }
        return res;
    }
}
