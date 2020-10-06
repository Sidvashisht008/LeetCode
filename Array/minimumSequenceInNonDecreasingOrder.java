class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int[] sum = new int[nums.length];
        int a =0;
        for(int i =0;i<nums.length;i++){
            a += nums[i];
            sum[i] = a;
        }
        List<Integer> res = new ArrayList<>();
        res.add(nums[nums.length-1]);
        a = nums[nums.length-1];
        int index = nums.length-2;
        while(index>=0 && a<=sum[index]){
            a+=nums[index];
            res.add(nums[index]);
            index--;
        }
        return res;
    }
}
