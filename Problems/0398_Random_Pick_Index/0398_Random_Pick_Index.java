class Solution {
    HashMap<Integer,ArrayList> locationMap;
    public Solution(int[] nums) {
        locationMap = new HashMap<Integer,ArrayList>();
        for(int i=0;i<nums.length;i++){
            if(locationMap.containsKey(nums[i])){
                locationMap.get(nums[i]).add(i);
            }
            else{
                ArrayList<Integer> myList = new ArrayList<Integer>();
                myList.add(i);
                locationMap.put(nums[i],myList);
            }
        }
    }
    
    public int pick(int target) {
        ArrayList myLocation=locationMap.get(target);
        Random rn = new Random();
        return (int)myLocation.get(rn.nextInt(myLocation.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */