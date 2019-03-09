class Solution {
    public int maxProfit(int[] prices) {
        //best case: buy from the lowest and sell at highest
        //basic method: compare every permutation
        //n to n+1,2,3...
        //keep the biggest distance
        //can I assume?
        
        //so this is the base case with worse effeciency.
        //so with the lowest so far, if there is something even lower, replace the lower
        //if higher than lower, check if the higher will be high enough for profit
        //if neither, just move on
        /*
        if(prices.length<2){return 0;}
        int buy;
        int sell;
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            buy = prices[i];
            for(int j=i;j<prices.length;j++){
                sell = prices[j];
                if((sell-buy)>profit){
                    profit = sell-buy;
                }
            }
        }
        return profit;
        */
        if(prices.length<2){return 0;}
        int minimum=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(minimum>prices[i]){minimum=prices[i];}
            else if(prices[i]-minimum>profit){profit=prices[i]-minimum;}
        }
        return profit;
    }
}
