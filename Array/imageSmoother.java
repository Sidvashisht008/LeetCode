class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] nimage = new int[M.length][M[0].length];
        for(int row = 0;row<M.length;row++){
            for(int col = 0;col<M[0].length;col++){
                float sum = M[row][col];
                int count = 1;
                if(row-1>=0 && col-1>=0){
                    sum+=M[row-1][col-1];
                    count++;
                }
                if(row-1>=0){
                    count++;
                    sum+=M[row-1][col];
                }
                if(row-1>=0 && col+1<M[0].length){
                    sum+=M[row-1][col+1];
                    count++;
                }
                if(col-1>=0){
                    sum+=M[row][col-1];
                    count++;
                }
                if(col+1<M[0].length){
                    sum+=M[row][col+1];
                    count++;
                }
                if(row+1<M.length && col-1>=0){
                    sum+=M[row+1][col-1];
                    count++;
                }
                if(row+1<M.length){
                    sum+=M[row+1][col];
                    count++;
                }
                if(row+1<M.length && col+1<M[0].length){
                    count++;
                    sum+=M[row+1][col+1];
                }
                nimage[row][col] = (int)Math.floor(sum/count);
            }
        }
        return nimage;
    }
}
