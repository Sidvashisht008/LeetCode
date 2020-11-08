class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n+1];
        if(nums.length == 1){
            return 0;
        }else if(nums.length == 2){
            return 1;
        }
        nums[1] = 1;
        int a = n/2;
        if(n%2!=0){
            a= n/2+1;
        }
        for(int i = 1;i<a;i++){
            nums[2*i] = nums[i];
            nums[2*i+1] = nums[i] + nums[i+1];
        }
        Arrays.sort(nums);
        return nums[nums.length-1];

    }
}
