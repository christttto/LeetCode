class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int localMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                localMax=0;
            }
            else{
                localMax++;
                if(max<localMax){
                    max=localMax;
                }    
            }
            
        }
        return max;
    }
}