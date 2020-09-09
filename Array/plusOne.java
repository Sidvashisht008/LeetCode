import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> res = new LinkedList<>();
        int i = digits.length-1;
        int carry = 1;
        while(i>=0){
            int sum = digits[i] + carry;
            carry = sum/10;
            sum = sum %10;
            res.addFirst(sum);
            i--;
        }
        if(carry!=0){
            res.addFirst(carry);
            carry = 0;
        }
        int[] arr = new int[res.size()];
        for(int x:res){
            arr[carry++] = x;
        }
        return arr;
    }
}
