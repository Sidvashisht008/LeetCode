class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int len = nums.length;
        for(int i = 0;i<len;i++){
            if(nums[i] == 0){
                for(int j = i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = 0;
                i--;
                len--;
            }
        }
    }
}
