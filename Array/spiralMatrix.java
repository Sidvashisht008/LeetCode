class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<Integer>();
        }
        int minRow = 0;
        int minCol = 0;
        int maxRow = matrix.length-1;
        int maxCol = matrix[0].length-1;
        int count = 0;
        List<Integer> res = new ArrayList<>();
        while(count<matrix.length*matrix[0].length){
            
            for(int i = minCol;i<=maxCol && count<matrix.length*matrix[0].length;i++){
                res.add(matrix[minRow][i]);
                count++;
            }
            minRow++;
            
            for(int i = minRow;i<=maxRow && count<matrix.length*matrix[0].length;i++){
                res.add(matrix[i][maxCol]);
                count++;
            }
            maxCol--;
            for(int i = maxCol;i>=minCol && count<matrix.length*matrix[0].length;i--){
                res.add(matrix[maxRow][i]);
                count++;
            }
            maxRow--;
            for(int i = maxRow;i>=minRow && count<matrix.length*matrix[0].length;i--){
                res.add(matrix[i][minCol]);
                count++;
            }
            minCol++;
        }
        return res;
    }
}
