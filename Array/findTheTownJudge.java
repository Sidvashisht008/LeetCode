class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustCount = new int[N+1];
        for(int i=0;i<trust.length;i++)
        {
            trustCount[trust[i][0]]--;
            trustCount[trust[i][1]]++;
        }
        for(int i=1;i<trustCount.length;i++)
        {
            if(trustCount[i] == N-1)
            {
                return i;
            }
        }
        return -1; 
    }
}
