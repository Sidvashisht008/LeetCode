class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0 || nums.length==1 ||nums.length==2 ){
            return -1;
        }
        int[] res = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
        }
        if(res[res.length-1]-res[0] == 0){
                return 0;
        }
        for(int i = 1;i<res.length;i++){
            if(res[i-1] == res[res.length-1]-res[i]){
                return i;
            }
        }
        return -1;
    }
}
