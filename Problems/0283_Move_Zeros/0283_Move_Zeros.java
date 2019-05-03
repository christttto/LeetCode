class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0){
                int j=i+1;
                while(j<nums.length&&nums[j]!=0){
                    nums[j-1]=nums[j];
                    nums[j]=0;
                    j++;
                }
            }
        }
        
    }
}