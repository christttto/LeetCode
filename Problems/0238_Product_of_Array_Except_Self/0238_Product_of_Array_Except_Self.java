class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] myNums = new int[nums.length];
        myNums[0]=1;
        for(int i=1;i<myNums.length;i++){
            myNums[i]=myNums[i-1]*nums[i-1];
        }
        int next=1;
        for(int i=myNums.length-1;i>=0;i--){
            myNums[i]*=next;
            next*=nums[i];
        }
        return myNums;
    }
}