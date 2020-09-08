class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int[] res = new int[size];
        int k = 0;
        for(int i = 1;i<nums.length;i+=2){
            int val = nums[i-1];
            while(val-->0){
                res[k++] = nums[i];
            }
        }
        return res;
    }
}
