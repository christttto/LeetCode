class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //sort, remove duplicates
        List returnList = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                returnList.add(nums2[j]);
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else {
                i++;
            }
        }
        return returnList.toArray();
    }
}