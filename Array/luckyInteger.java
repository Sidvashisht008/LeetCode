import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public int findLucky(int[] arr) {
        int maxLucky = -1;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i =0 ;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                Integer c = hmap.get(arr[i]);
                hmap.put(arr[i],c+1);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        for(Entry <Integer,Integer> val:hmap.entrySet()){
            if(val.getValue()==val.getKey() && maxLucky<val.getValue()){
                maxLucky = val.getValue();
            }
        }
        return maxLucky;
    }
}
