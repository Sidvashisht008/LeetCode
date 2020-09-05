import java.util.Map.Entry;
class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1 || arr.length == 2){
            return arr[0];
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i<arr.length; i++){
            if(hmap.containsKey(arr[i])){
                int c = hmap.get(arr[i]);
                hmap.put(arr[i],c+1);
                continue;
            }
            hmap.put(arr[i],1);
        }
        for(Entry<Integer,Integer> val:hmap.entrySet()){
            if((float)val.getValue()/(float)(arr.length)>0.25){
                return val.getKey();
            }
        }
        return -1;
    }
}
