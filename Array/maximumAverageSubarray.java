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


// Improved Method

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            nums[i] = sum;
        }
        double avg = Integer.MIN_VALUE;
        int j = -1;
        for(int i = k-1;i<nums.length;i++){
            if(j<0){
                avg = nums[i];
            }else{
                if(nums[i]-nums[j]>avg){
                    avg = nums[i] - nums[j];
                }
            }
            j++;
        }
        return avg/k;
    }
}
