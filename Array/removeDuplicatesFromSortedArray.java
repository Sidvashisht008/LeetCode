////////////////// Not ideal soulution //////////////////

class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for(int i =0;i<length-1;i++){
            if(nums[i+1]==nums[i]){
                for(int j = i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                i--;
                length--;
            }
        }
        return length;
    }
}

//////////////////////////////////////////////////////////
