class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length==1 || A.length == 0){
            return false;
        }
        int i = 0;
        while(i<A.length-1 && A[i]<=A[i+1]){
            if(A[i]==A[i+1]){
                return false;
            }
            i++;
        }
        if(i == 0 || i == A.length-1){
            return false;
        }
        int k = i+1;
        while(k<A.length-1 && A[k]>=A[k+1]){
            if(A[k]==A[k+1]){
                return false;
            }
            k++;
        }
        if(k+1 == A.length){
            return true;
        }return false;
    }
}
