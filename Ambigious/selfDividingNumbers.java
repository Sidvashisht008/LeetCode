class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left ;i<=right;i++){
            if(sdn(i)){
                res.add(i);
            }
        }    
        return res;
    }
    public boolean sdn(int n){
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            temp/=10;
            if(rem == 0){
                return false;
            }
            if(n % rem !=0){
                return false;
            }
        }
        return true;
    }
    
}
