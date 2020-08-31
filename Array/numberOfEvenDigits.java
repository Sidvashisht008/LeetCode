class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int i = 0;i<nums.length;i++){
            String temp = String.valueOf(nums[i]);
            if(temp.length()%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}
