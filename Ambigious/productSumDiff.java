class Solution {
    public int subtractProductAndSum(int n) {
        return mul(n) - sum(n);
    }
    public int sum(int n){
        int ans = 0;
        while(n>0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
    public int mul(int n){
        int ans = 1;
        while(n>0){
            ans*=n%10;
            n/=10;
        }
        return ans;
    }
}
