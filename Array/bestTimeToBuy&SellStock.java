class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int maxProfit = 0;
        for(int i =0;i<prices.length-1;i++){
            int tempProfit = 0;
            for(int j =i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>0 && tempProfit<prices[j]-prices[i]){
                    tempProfit = prices[j]- prices[i];
                }
            }
            if(tempProfit>maxProfit){
                maxProfit = tempProfit;
            }
        }
        return maxProfit;
    }
}
