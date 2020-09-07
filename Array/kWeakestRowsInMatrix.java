class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[mat.length];
        int[] res2 = new int[k];
        int m = 0;
        for(int row = 0;row<mat.length;row++){
            int count = 0;
            for(int col = 0;col<mat[0].length;col++){
                if(mat[row][col] == 1){
                    count++;
                }
            }
            res[m++] = count;
        }
        for(int x:res){
            System.out.print(x+" ");
        }
        int j = 0;
        while(k-->0){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int i = 0;i<res.length;i++){
                if(res[i]<min){
                    min = res[i];
                    index = i;
                }
            }
            res2[j++] = index;
            res[index] = Integer.MAX_VALUE;    
        }
        return res2;
    }
}
