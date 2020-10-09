class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res,-1);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                res[0] = i;
                res[1] = i;
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j] == target){
                        res[1] = j;
                    }
                }
                break;
            }
        }
        return res;
    }
}
