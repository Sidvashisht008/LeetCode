class Solution {
    public int heightChecker(int[] heights) {
        int[] h = new int[heights.length];
        for(int i = 0;i<h.length;i++){
            h[i]=heights[i];
        }
        Arrays.sort(h);
        int cnt = 0;
        for(int i =0;i<h.length;i++){
            if(h[i]!=heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
