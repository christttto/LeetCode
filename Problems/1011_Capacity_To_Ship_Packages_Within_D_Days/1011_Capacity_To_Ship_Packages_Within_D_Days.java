class Solution {
    private boolean shipHelper(int [] W,int D, int C){
        
        for(int i=0;i<D;i++){
            int myCapacity=0;
            while(myCapacity<C){
                
            }
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