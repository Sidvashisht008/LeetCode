class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i<arr1.length;i++){
            if(hmap.containsKey(arr1[i])){
                hmap.put( arr1[i] ,hmap.get(arr1[i])+1);
                continue;
            }
            hmap.put(arr1[i],1);
        }
        int[] arr4 = new int[arr1.length];
        int k = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<arr2.length;i++){
            if(hmap.containsKey(arr2[i])){
                while(hmap.get(arr2[i])!=0){
                    arr4[k++] = arr2[i];
                    hmap.put(arr2[i],hmap.get(arr2[i])-1);
                }
            }
        }
        for(int i = 0;i<arr1.length;i++){
            if(hmap.containsKey(arr1[i]) && hmap.get(arr1[i])>0){
                while(hmap.get(arr1[i])!=0){
                    res.add(arr1[i]);
                    hmap.put(arr1[i],hmap.get(arr1[i])-1);
                }
            }
        }
        Collections.sort(res);
        for(int x:res){
            arr4[k++] = x;
        }
        return arr4;
    }
}
