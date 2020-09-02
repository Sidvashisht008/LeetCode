class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = 0;i<index.length;i++){
            res.add(index[i],nums[i]);
        }
        int[] arr = new int[nums.length];
        int k = 0;
        for(int val:res){
            arr[k++] = val; 
        }
        return arr;
    }
}
