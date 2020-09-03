class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length-1;i++){
            int min = Math.abs(arr[i+1] - arr[i]);
            if(min<mindiff){
                mindiff = min;
                res.clear();
                List<Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                res.add(a);
            }else if(min == mindiff){
                List<Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                res.add(a);
            }
        }
        return res;
    }
}
