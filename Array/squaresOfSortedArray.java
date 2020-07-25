class Solution {
    public int[] sortedSquares(int[] A) {
        int flag = -1;
        for(int i =0 ;i<A.length;i++){
            if(A[i]<0){
                A[i] = flag*A[i];
            }
        }
        Arrays.sort(A);
        for(int i =0;i<A.length;i++){
            A[i] = A[i]*A[i];
        }
        return A;
    }
}
