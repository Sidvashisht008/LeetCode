class Solution {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        int count = 0;
        int globalMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                count = 1;
                max = arr[i];
            } else {
                count++;
            }
            globalMax = Math.max(globalMax, arr[i]);
            if (count == k) {
                return max;
            }
        }
        return globalMax;
    }
}
