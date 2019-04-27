class Solution {
    public int coinChange(int[] coins, int amount) {
        //sort the array to use the biggest first
        Arrays.sort(coins);//nlogn
        int numOfCoins=0;
        for(int i=coins.length-1;i>=0;i--){
            if(amount==0)break;
            numOfCoins+=amount/coins[i];
            amount=amount%coins[i];
        }
        if(amount==0) return numOfCoins;
        else return -1;
        
        
    }
}