class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double startValue = nums[0];
        double myMax = 0;
        for(int i=0;i<k;i++){
            myMax+=nums[i];
        }
        double currentMax = myMax;
        for(int i=k;i<nums.length;i++){
            currentMax = currentMax-startValue+nums[i];
            startValue = nums[i-k+1];
            if(myMax < currentMax) myMax=currentMax;
        }
        return myMax/k;
    }
}
