class Solution {
    public int[] finalPrices(int[] prices) {
        if(prices.length == 1){
            return prices;
        }
        int[] disc =  new int[prices.length];
        for(int i = 0;i<prices.length-1;i++){
            int j = i+1;
            while(j<prices.length && prices[j]>prices[i]){
                j++;
            }
            if(j<prices.length && prices[i]>=prices[j]){
                disc[i] = prices[i]-prices[j];
            }else{
                disc[i] = prices[i];
            }
        }
        disc[disc.length-1] = prices[prices.length-1];
        return disc;
    }
}
