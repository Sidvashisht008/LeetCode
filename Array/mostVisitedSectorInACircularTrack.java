class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> ans = new ArrayList();
        int dif;
        if(rounds[rounds.length-1]-rounds[0]>=0)
            dif=rounds[rounds.length-1]-rounds[0]+1;
        else
            dif=n+rounds[rounds.length-1]-rounds[0]+1;
        int[] secs = new int[n];
        for(int i=0;i<dif;i++) {
            int dig = rounds[0]+i-1;
            if(dig>=n)
                dig-=n;
            secs[dig]++;
        }
        for(int i=0;i<n;i++)
            if(secs[i]>0)
                ans.add(i+1);
        return ans;
    }
}
