class Solution {

    public int shipWithinDays(int[] weights, int D) {
        //variation of bs
        int left=Integer.MIN_VALUE;
        int right=0;
        //left is myMax, the right will be totalWeights to create my initial boundary
        for(int i:weights){
            right+=i;
            left= left<i ? i : left;
        }
        //binary search with 
        while(left<right){//so while left bound is still smaller than the right, because it will keep on shrinking
            int middle=(left+right)/2;//this will become either the left or the right
            int need=1;
            int current=0;//current weight 
            for(int i:weights){
                if(current+i>middle){//if the weight added goes over my capacity, automatically starts the next day
                    need++;
                    current=0;
                }
                current+=i;
            }
            //this is the binary section
            if(need>D) left=middle+1;//myCapacity was too small, need to go bigger range
            else right=middle;//myCapacity was too big, need to go smaller range
        }
        return left;
    }
}