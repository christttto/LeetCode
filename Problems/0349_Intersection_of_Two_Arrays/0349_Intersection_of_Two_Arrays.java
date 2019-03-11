class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //so no need to sort
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int n: nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int n: nums2) set2.add(n);
        //make two sets for nums1,2
        set1.retainAll(set2);
        //key function of hashset, retainAll. does intersection
        
        //done with making, just reformatting to be array
        int[] returnArray = new int[set1.size()];//make array of setsize.
        int j=0;
        for(int n: set1)returnArray[j++] = n;
        return returnArray;
    }
}