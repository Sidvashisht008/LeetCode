import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                int c = hmap.get(nums[i]);
                hmap.put(nums[i],c+1);
            }else{
                hmap.put(nums[i],1);
            }
        }
        for(Entry<Integer,Integer> val:hmap.entrySet()){
           if(val.getValue()>nums.length/2){
                return val.getKey();
            }
        }
        return -1;
    }
}
