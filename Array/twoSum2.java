class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0;
        int hi = numbers.length-1;
        int[] index = new int[2];
        while(lo<hi){
            if(numbers[lo]+numbers[hi]==target){
                index[0] = lo+1;
                index[1] = hi+1;
                return index;
            }else if(numbers[lo]+numbers[hi]>target){
                hi--;
            }
            else if(numbers[lo]+numbers[hi]<target){
                lo++;
            }
        }
        return index;
    }
}
