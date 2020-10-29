class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int n=g.length,m=s.length;
        int i=0,j=0;
        while(i<n&&j<m){
             if(g[i]<=s[j]){ans++;i++;j++;}
             else 
                 j++;
        }
        return ans;
    }
}
