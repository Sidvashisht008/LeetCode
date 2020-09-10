class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(Math.abs(nums[j] - nums[i])==k){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    Collections.sort(res);
                    hs.add(res);
                }
            }
        }
        return hs.size();
    }
}
