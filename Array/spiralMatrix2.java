class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int val = 1;
        int count = 0;
        int minRow = 0;
        int minCol = 0;
        int maxRow = matrix.length-1;
        int maxCol = matrix[0].length-1;
        while(count<n*n){
            for(int i = minCol;i<=maxCol && count<matrix.length*matrix[0].length;i++){
                matrix[minRow][i] = val;
                val++;
                count++;
            }
            minRow++;
            
            for(int i = minRow;i<=maxRow && count<matrix.length*matrix[0].length;i++){
                matrix[i][maxCol] = val;
                val++;
                count++;
            }
            maxCol--;
            for(int i = maxCol;i>=minCol && count<matrix.length*matrix[0].length;i--){
                matrix[maxRow][i] = val;
                val++;
                count++;
            }
            maxRow--;
            for(int i = maxRow;i>=minRow && count<matrix.length*matrix[0].length;i--){
                matrix[i][minCol] = val;
                val++;
                count++;
            }
            minCol++;
        }
        return matrix;
    }
}
