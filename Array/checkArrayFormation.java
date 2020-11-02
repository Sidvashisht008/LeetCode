class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] hash = new int[101];
        Arrays.fill(hash, -1);
        int len = arr.length, cnt = len;
        for(int i = 0; i < arr.length; i++)
            hash[arr[i]] = i;
        
        for(int[] p : pieces) {
            for(int i = 0; i < p.length; i++) {
                int val = p[i];
                if(hash[val] == -1 || (i > 0 && hash[p[i - 1]] != hash[val] - 1))
                    return false;
                cnt--;
            }
        }
        return cnt == 0;
    }
}
