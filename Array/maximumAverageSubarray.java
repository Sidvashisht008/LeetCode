class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length - k+1;i++){
            int j = i+k-1;
            double temp = 0;
            for(int m = i;m<=j;m++){
                temp+=nums[m];
            }
            temp/=k;
            if(temp>avg){
                avg = temp;
            }
        }
        return avg;
    }
}
