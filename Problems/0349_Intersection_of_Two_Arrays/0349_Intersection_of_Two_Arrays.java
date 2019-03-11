class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //sort, remove duplicates
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(Integer i: nums1)set1.add(i);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(Integer i: nums2)set2.add(i);
        set1.retainAll(set2);
        int[] returnList = new int[set1.size()];
        int i=0;
        for(int n: set1)returnList[i++]=n;
        return returnList;
    }
}