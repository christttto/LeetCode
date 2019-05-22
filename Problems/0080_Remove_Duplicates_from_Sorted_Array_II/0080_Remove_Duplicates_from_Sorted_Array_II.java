class Solution {
    public int removeDuplicates(int[] nums) {
        //one way is everytime, a duplicate of third has been seen, remove and shift everything one step forward.
        //do a swap everytime a third duplicate has been seen, everytime swap happened, decrease the iteration by 1
        //have first and second. if they are less than myself, it is new iteration, reset the variables
        //
        if(nums.length<3)return nums.length;
        int repeats=0;
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-repeats;i++){
            if(nums[i]==first){//one repeat
                if(nums[i]==second){//two repeats
                    //need to do swap
                    //need to count how many shifts are needed
                    int myRepeats=0;
                    while(nums[i+myRepeats]==second){
                        myRepeats++;
                    }
                    for(int j=i;j+myRepeats<nums.length-repeats-1;j++){
                        int temp = nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                    repeats++;
                }
                else{
                    second=nums[i];
                }
            }
            else{
                first=nums[i];
            }
            
        }
        return nums.length-repeats;
    }
}