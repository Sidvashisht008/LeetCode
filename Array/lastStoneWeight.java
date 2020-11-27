class Solution {  
    static int getSum(int[] stones)
    {
        int sum = 0; 
        for (int i = 0; i < stones.length; i++)
        {
            sum += stones[i];
        }
        return sum;
    }
    
    public int lastStoneWeight(int[] stones) {
        
        if (stones.length == 1) return stones[0];
        
        int sumOld = getSum(stones);
        int sumNew = 0;
        while (sumNew != sumOld)
        {
            sumOld = getSum(stones);
            
            Arrays.sort(stones);
            int val1 = stones[stones.length-1] - stones[stones.length - 2];
            int val2 = stones[stones.length-2] - stones[stones.length - 1];
            if (val2 < 0) val2 = 0;
            stones[stones.length-1] = val1;
            stones[stones.length-2] = val2;
                        
            sumNew = getSum(stones);
        }
        return sumNew;
    }
}
