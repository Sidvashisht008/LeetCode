class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = nums.length/2;
        int k = 0;
        while(j<nums.length){
            arr[k++] = nums[i];
            arr[k++] = nums[j];
            i++;
            j++;
        }
        return arr;
    }
}
