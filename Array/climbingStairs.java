class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        return climb_Stairs(0,n,arr);
    }
    public int climb_Stairs(int i,int n,int memo[]){
        if(i == n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(memo[i]>0){
            return memo[i];
        }
        memo[i] = climb_Stairs(i+1,n,memo)+climb_Stairs(i+2,n,memo);
        return memo[i];
    }
}
