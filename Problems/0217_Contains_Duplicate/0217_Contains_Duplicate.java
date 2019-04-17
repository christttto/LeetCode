class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set numsSet = new HashSet();
        for(int i:nums){
            if(numsSet.contains(i)) return true;
            else numsSet.add(i);
        }
        return false;
    }
}
