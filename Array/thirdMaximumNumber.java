import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> s = new HashSet<>();
        for(int x:nums){
            s.add(x);
        }
        nums = new int[s.size()];
        int k = 0;
        for(int x:s){
            nums[k++] = x;
        }
        Arrays.sort(nums);
        if(nums.length>=3){
           return nums[nums.length-3];
        }return nums[nums.length-1];
        
    }
}
