class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            boolean flag = true;
            for(int j = 0;j<candies.length;j++){
                if (i ==j){
                    continue;
                }
                if(candies[i]+extraCandies<candies[j]){
                    res.add(false);
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(true);
            }
        }
        return res;
    }
}
