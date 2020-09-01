class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int a = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = start + 2*i;
            a^=arr[i];
        }
        return a;
    }
}
