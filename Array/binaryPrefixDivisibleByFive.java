class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int val = 0;
        for(int i=0;i<A.length;i++){
            val = val * 2 + A[i];
            if((val %= 5) == 0)
                list.add(true);
            else
                list.add(false);
            
        }
        return list;
    }
}
