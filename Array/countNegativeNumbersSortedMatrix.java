class Solution {
    public int countNegatives(int[][] grid) {
        int cnt =0;
        for(int col = 0;col<grid[0].length;col++){
            for(int row = grid.length-1;row>=0;row--){
                if(grid[row][col]>=0){
                    break;
                }
                cnt++;
            }
        }
        return cnt;
    }
}
