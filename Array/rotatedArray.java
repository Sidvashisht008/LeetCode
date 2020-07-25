class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        while(k-->0){
            int temp = nums[nums.length-1];
            int i = nums.length-1;
            while(i>=1){
                nums[i] = nums[i-1];
                i--;    
            }
            nums[0] = temp;
        }
    }
}
