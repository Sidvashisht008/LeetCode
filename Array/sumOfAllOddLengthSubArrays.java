class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if((j-i)%2==0 || i==j){
                    for(int k = i;k<=j;k++){
                        sum+=arr[k];
                    }    
                }    
            }
        }
        return sum;
    }
}
