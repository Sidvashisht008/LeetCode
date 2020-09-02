class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0 && hmap.containsKey(0)){
                return true;
            }
            if(arr[i] == 0){
                hmap.put(arr[i],0);
            }else{
                hmap.put(arr[i],1);    
            }
            
        }
        for(int i = 0;i<arr.length;i++){
            if(hmap.containsKey(2*arr[i]) && hmap.get(arr[i])!=0){
                return true;
            }
        }
        return false;
    }
}
