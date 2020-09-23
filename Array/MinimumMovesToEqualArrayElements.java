class Solution {
    public int minMoves(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(minValue>nums[i]){
                minValue = nums[i];
            }
        }
        return sum - minValue*nums.length;
    }
}
