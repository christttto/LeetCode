class Solution {
    public void sortColors(int[] nums) {
        for(int i=0,j=0,k=nums.length-1;i<=k;i++){
            //since there are only 0,1,2
                //if 0, swap with ith
                //if 1, leave it as is
                //if 2, send to back
            if(nums[i]==0){
                nums[i]=nums[j];
                nums[j]=0;
                j++;
                
            }
            else if(nums[i]==2){
                //swap with what was at k
                nums[i]=nums[k];
                nums[k--]=2;
                i--;
            }
            else{
                
            }
            
        }
    }
}