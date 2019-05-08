class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashSet
        //check before adding in case of target=2*n, n
        HashMap<Integer,Integer> myMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(myMap.containsKey(target-nums[i])){
                return new int[]{myMap.get(target-nums[i]),i};
            }
            myMap.put(nums[i],i);
        }
        return nums;
    }
}