class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(nums[middle]==target)return true;
            if(nums[left]<nums[middle]){//left side is normal
                //check if left side has the target, if not use the right side
                if(nums[left]<=target&&target<nums[middle])right=middle;
                else left=middle;
            }
            else if(nums[left]>nums[middle]){//right side is normal
                //check if right side as the target, if not use the left side
                if(nums[middle]<target&&nums[left]>target) left=middle;
                else right=middle;
            }
            else{
                left++;
            }
            // else if(middle<target)right = middle-1;
            // else left=middle+1;
        }
        return false;
    }
}