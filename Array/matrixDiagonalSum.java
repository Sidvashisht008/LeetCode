class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int row = 0;row<mat.length;row++){
            for(int col = 0;col<mat[0].length;col++){
                if(row == col){
                    sum+=mat[row][col];
                }
                else if(row + col == mat.length - 1){
                    sum+=mat[row][col];
                }
            }
        }
        return sum;
    }
}
