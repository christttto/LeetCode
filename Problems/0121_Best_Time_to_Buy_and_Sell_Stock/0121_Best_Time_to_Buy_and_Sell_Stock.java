class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)return 0;
        int sell=prices[prices.length-1];
        int profit = 0;
        for(int i=prices.length-2;i>=0;i--){
            if(sell<prices[i])sell=prices[i];
            else{
                if(sell-prices[i]>profit)profit=sell-prices[i];    
            }
        }
        return profit;
    }
}