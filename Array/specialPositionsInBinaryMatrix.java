class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int rows = 0;rows < mat.length;rows++){
            for(int cols = 0 ;cols < mat[0].length;cols++){
                if(mat[rows][cols] == 1){
                    boolean row = true;
                    boolean col = true;
                    for(int j = 0;j<mat[0].length;j++){
                        if(mat[rows][j]==1 && j!=cols){
                            row = false;
                            break;
                        }
                    }
                    for(int j = 0;j<mat.length;j++){
                        if(mat[j][cols]==1 && (j!=rows)){
                            col = false;
                            break;
                        }
                    }
                    if(row && col){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
