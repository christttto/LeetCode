class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create set
        //iterate through the set to find where set.contains(target-nums[i]);
        //create hashmap of <nums[i],i>
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(myMap.containsKey(target-nums[i])){
                return new int[]{i,myMap.get(target-nums[i])};
            }
            else{
                myMap.put(nums[i],i);
            }
        }
        return null;
    }
}