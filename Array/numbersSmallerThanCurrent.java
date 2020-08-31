class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int min = nums[i];
            int cnt = 0;
            for(int j = 0;j<nums.length;j++){
                if(j == i){
                    continue;
                }
                if(min>nums[j]){
                    cnt++;
                }
            }
            arr[i] = cnt;
        }
        return arr;
    }
}
