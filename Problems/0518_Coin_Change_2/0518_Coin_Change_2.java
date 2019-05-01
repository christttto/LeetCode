import java.util.Arrays;
class Solution {
    private int numChange;
    private void changeHelper(int amount, int[] coins, int location){
        if(amount==0){
            //System.out.println("here");
            numChange+=1;
        }
        else{
            for(int i=location;i<coins.length;i++){
                if(amount>=coins[i]){
                    //System.out.println(coins[i]+" "+amount);
                    changeHelper(amount-coins[i],coins,i);
                }
            }
        }
    }
    public int change(int amount, int[] coins) {
        numChange=0;
        Arrays.sort(coins);
        for(int i=0;i<coins.length/2;i++){
            int temp=coins[i];
            coins[i]=coins[coins.length-1-i];
            coins[coins.length-1-i]=temp;
        }
        changeHelper(amount,coins,0);
        return numChange;
    }
}