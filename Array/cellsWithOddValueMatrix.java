class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        for(int i = 0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int col = 0;col<matrix[0].length;col++){
                matrix[r][col]++;
            }
            for(int row = 0;row<matrix.length;row++){
                matrix[row][c]++;
            }
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
