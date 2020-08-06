class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0;i<A.length;i++){
            A[i] = reverse(A[i]);
            int lo = 0;
            int hi = A.length-1;
            while(lo<hi){
                int temp = A[lo];
                A[lo] = A[hi];
                A[hi] = temp;
                lo++;
                hi--;
            }
        }
        for(int row =0;row<A.length;row++){
            for(int col = 0;col<A[0].length;col++){
                if(A[row][col] == 0){
                    A[row][col] = 1;
                    continue;
                }
                A[row][col] = 0;
            }
        }
        return A;
    }
    public int[] reverse(int[] A){
        int lo = 0;
        int hi = A.length-1;
        while(lo<hi){
            int temp = A[lo];
            A[lo] = A[hi];
            A[hi] = temp;
            lo++;
            hi--;
        }
        return A;
    }
    
}class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0;i<A.length;i++){
            A[i] = reverse(A[i]);
            int lo = 0;
            int hi = A.length-1;
            while(lo<hi){
                int temp = A[lo];
                A[lo] = A[hi];
                A[hi] = temp;
                lo++;
                hi--;
            }
        }
        for(int row =0;row<A.length;row++){
            for(int col = 0;col<A[0].length;col++){
                if(A[row][col] == 0){
                    A[row][col] = 1;
                    continue;
                }
                A[row][col] = 0;
            }
        }
        return A;
    }
    public int[] reverse(int[] A){
        int lo = 0;
        int hi = A.length-1;
        while(lo<hi){
            int temp = A[lo];
            A[lo] = A[hi];
            A[hi] = temp;
            lo++;
            hi--;
        }
        return A;
    }
    
}
