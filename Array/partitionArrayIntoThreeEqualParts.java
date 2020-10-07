class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i = 0;i<A.length;i++){
            sum+=A[i];
        }
        if(sum%3!=0){
            return false;
        }
        int temp = 0;
        int found = 0;
        sum/=3;
        for(int i = 0;i<A.length;i++){
            temp+=A[i];
            if(temp == sum){
                temp = 0;
                found++;
            }
        }
        return found>=3?true:false;
    }
}
