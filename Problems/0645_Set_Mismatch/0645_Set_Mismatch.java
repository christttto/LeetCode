class Solution {
    public int[] findErrorNums(int[] nums) {
        //use set to find the duplicate
        //finish making the set of nums-duplicate
        //if we know what number was repeated, the second repeat was the right position.
        //
        Set<Integer> mySet = new HashSet<Integer>();
        int myRepeat = 0;
        for(int i=0;i<nums.length-1;i++){
            if(!mySet.add(nums[i])) myRepeat = nums[i];
        }
        if(myRepeat==0)return new int[]{nums[nums.length-1],nums[nums.length-1]+1};//the very last one was repeat
        int i=1;
        while(mySet.contains(i++)){}
        return new int[]{myRepeat,--i};
    }


}