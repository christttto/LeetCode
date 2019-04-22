import java.util.Arrays; 
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;i++,j++){
            if(nums1[i]==nums2[j])numsList.add(nums1[i]);
            else if(nums1[i]>nums2[j]){
                i--;
            }
            else{
                j--;
            }
        }
        return numsList.stream().mapToInt(i -> i).toArray();
    }
}
