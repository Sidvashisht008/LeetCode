import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer c=hmap.get(nums[i]);
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],c+1);
            }
            else{
                hmap.put(nums[i],1);
            }
        }
        List myList = new ArrayList();
        for(Entry<Integer,Integer> val:hmap.entrySet()){
            if(val.getValue()==2){
                myList.add(val.getKey());
            }
        }
        return myList;
    }
}
