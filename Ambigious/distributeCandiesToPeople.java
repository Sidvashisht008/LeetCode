class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int res[] = new int[num_people];
		int can = 0;
		for(int i=0;i<res.length && candies > 0;i++) {
			if(candies <= can) 
				res[i] = res[i]+candies;
			else res[i] = res[i] +  ++can;
			candies = candies-(can);
			if(i == res.length-1) 
				i=-1;			
		}
        return res;
    }
}
