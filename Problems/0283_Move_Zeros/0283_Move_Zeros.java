class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int j=i-1;
                while(j>=0){
                    if(nums[j]!=0){
                        nums[j+1]=nums[j];
                        nums[j]=0;
                    }
                    j--;
                }
            }
        }
        
    }
}
