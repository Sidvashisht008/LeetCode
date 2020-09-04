class Solution {
    public int minStartValue(int[] nums) {
        int value = 1;
        while(true){
            int startValue = value;
            for(int i = 0;i<nums.length;i++){
                if(startValue + nums[i] >=1){
                    startValue +=nums[i];
                }else{
                    value++;
                    break;
                }
                if(i == nums.length-1){
                    return value;
                }
            }
        }    
    }
}
