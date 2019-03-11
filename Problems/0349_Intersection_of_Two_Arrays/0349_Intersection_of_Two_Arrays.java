class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int n: nums1)set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int n: nums2)set2.add(n);
        set1.retainAll(set2);
        
        int[] returnArray = new int[set1.size()];
        int i=0;
        for(int n: set1)returnArray[i++]=n;
        return returnArray;
    }
}