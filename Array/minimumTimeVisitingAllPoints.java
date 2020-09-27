class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int steps = 0;
        for(int i = 1; i < p.length; i++)
            steps += (int)Math.max(Math.abs(p[i-1][0] - p[i][0]), Math.abs(p[i-1][1] - p[i][1]));
        
        return steps;
    }
}
