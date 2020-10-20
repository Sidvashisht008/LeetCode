class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = (arr.length*5)/100;
        double sum = 0;
        int count = 0;
        for(int i=len;i<arr.length-len;i++){
            sum+=arr[i];
            count++;
        }
        return sum/count;
    }
}
