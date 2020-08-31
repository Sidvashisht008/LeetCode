class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        int x = 0;
        for(int i = 0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            row[x]=min;
            x++;
        }
        int y  = 0;
        for(int i = 0;i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<matrix.length;j++){
                if(matrix[j][i]>max){
                    max = matrix[j][i];
                }
            }
            cols[y] = max;
            y++;
        }
        Arrays.sort(row);
        Arrays.sort(cols);
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<>();
        while(i<row.length && j<cols.length){
            if(row[i] == cols[j]){
                res.add(row[i]);
                i++;
                j++;
            }else if(row[i] > cols[j]){
                j++;
            }else{
                i++;
            }
        }
        return res;
    }
}
