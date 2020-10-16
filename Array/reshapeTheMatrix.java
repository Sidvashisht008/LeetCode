class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length*nums[0].length !=r*c){
            return nums;
        }
        int k = 0;
        int[][] nmatrix = new int[r][c];
        int[] res = new int[r*c];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[0].length;j++){
                res[k++] = nums[i][j];
            }
        }
        k = 0;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                nmatrix[i][j] = res[k++];
            }
        }
        return nmatrix;
    }
}
