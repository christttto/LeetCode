class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums.length==2)return Math.min(nums[0],nums[1]);
        //sort array
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=Math.min(nums[i],nums[i+1]);
        }
        return sum;
        
    }
}