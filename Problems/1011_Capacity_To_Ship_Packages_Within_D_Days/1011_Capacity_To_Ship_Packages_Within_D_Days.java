class Solution {
    private boolean shipHelper(int [] W,int D, int C){
        //did my cargo fill up
        //did I go over my day limit
        int myD=0;
        int myCargo;
        int wCounter=0;
        while(myD<D){
            myCargo=0;
            while(myCargo<C){
                if(wCounter<W.length){
                    
                }
            }
            myD++;
        }
        return false;
    }
    public int shipWithinDays(int[] weights, int D) {
        //variation of bs
        int myMax=Integer.MIN_VALUE;
        int totalWeight=0;
        for(int i:weights){
            totalWeight+=i;
            myMax= myMax<i ? i : myMax;
        }
        
    }
}