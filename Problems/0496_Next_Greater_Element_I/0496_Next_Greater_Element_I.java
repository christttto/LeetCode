class Solution {
    private int bst(int[] nums,int target){
        int i=nums.length/2;
        
        while(i/2>0&&nums[i]!=target){//bst set up
            System.out.println("first look at"+i);
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                i-=i/2;
            }
            else{
                i+=i/2;
            }
        }
        System.out.println("returning"+i);
        return i;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //it seems like it will be good to have a sorted representation of nums2
        //set might be a good implementation
        //set with has next
        //sort the list, use binary search to find the next greater value
        // n*logn
        java.util.Arrays.sort(nums2);
        for(int i=0;i<nums2.length;i++){
            System.out.println(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            //binary search nums[i]
            //check if nums[i+1] exists
            //if not, nums[i]=-1
            System.out.println("for"+nums1[i]);
            nums1[i]=bst(nums2,nums1[i]);
        }
        return nums1;
        
    }
}
