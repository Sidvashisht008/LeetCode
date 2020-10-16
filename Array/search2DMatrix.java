class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = matrix.length-1;i>=0;i--){
            for(int j = matrix[0].length-1;j>=0;j--){
                if(target<matrix[i][j]){
                    continue;
                }
                if(target == matrix[i][j]){
                    return true;
                }
                if(i-1<0){
                    return false;
                }
            }
        }
        return false;
    }
}
