class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hmap.put(nums[i],1);
        }
        for(int i =1;i<=nums.length;i++){
            if(!hmap.containsKey(i)){
                res.add(i);
            }
        }
        return res;
    }
}
