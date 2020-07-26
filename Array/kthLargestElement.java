class Solution {
    public int findKthLargest(int[] nums, int k) {
      
        for(int cnt = 0;cnt<k;cnt++){
            for(int j = 0;j<nums.length-1-cnt;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums[nums.length-k];       
    }
}
