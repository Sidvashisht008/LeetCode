class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            hmap.put(arr[i],1);
        }
        int cnt = 1;
        while(k>0){
            if(!hmap.containsKey(cnt)){
                res.add(cnt);
                k--;
            }
            cnt++;
        }
        return res.get(res.size()-1);
    }
}
