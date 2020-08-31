class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = i+1;
            sum+= arr[i];
        }
        arr[arr.length-1] = -1*(sum);
        return arr;
    }
}
