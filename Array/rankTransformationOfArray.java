class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int[] arr2 = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        int k = 1;
        for(int i = 0;i < arr2.length; i++){
            if(hmap.containsKey(arr2[i])){
                continue;
            }
            hmap.put(arr2[i],k);
            k++;
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = hmap.get(arr[i]);
        }
        return arr;
    }
}
