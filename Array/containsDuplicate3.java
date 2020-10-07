//////////////////////////// One Test Case Failed(Time Limit Exceeded) /////////////////////////////////////
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                long sum = Math.abs((long)nums[i] - (long)nums[j]);
                if(sum<=t && j-i<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
