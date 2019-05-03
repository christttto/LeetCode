class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)return nums[0];
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(middle>0&&nums[middle-1]>nums[middle]){//the smallest is on my right
                return nums[middle];
            }
            else if(nums[left]<=nums[middle]&&nums[middle]>nums[right]){
                left=middle+1;
            }
            else{
                right=middle-1;
            }
        }
        return nums[left];
    }
}