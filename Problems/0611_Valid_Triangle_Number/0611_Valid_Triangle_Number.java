class Solution {
    public int triangleNumber(int[] nums) {
        //have sorted array
        //from back, go forward
        //the condition for valid trangle side is to have sum of 2,3 be lower than the first.
        //from the far back. if you hit one false, anything beyond that will be too small.
        Arrays.sort(nums);
        int validTriangle=0;
        for(int first=nums.length-1;first>1;first--){//the largest. goes all the way, but can be changed later
            
            int second=first-1;
            int third=first-2;
            
            while(third>=0&&nums[third]>0&&nums[second]+nums[third]>nums[first]){
                
                while(third>=0&&nums[third]>0&&nums[second]+nums[third]>nums[first]){
                    validTriangle++;
                    third--;
                }
                third=--second-1;
            }
        }
        return validTriangle;
    }
}