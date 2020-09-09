class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> res = new LinkedList<>();
        int i = A.length-1;
        int carry = 0;
        while(K>0 || i>=0){
            int sum = K%10 +carry;
            if(i>=0){
                sum += A[i];    
            }
            carry = sum/10;
            sum = sum%10;
            res.addFirst(sum);
            i--;
            K/=10;
        }
        if(carry > 0){
            res.addFirst(carry);
        }
        return res;
    }
}
