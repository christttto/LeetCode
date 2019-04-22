class NumArray {
    int[] myNums;
    public NumArray(int[] nums) {
        myNums=nums;
        
    }
    
    public int sumRange(int i, int j) {
        int total=0;
        while(i<=j){
            total +=this.myNums[i];
            i++;
        }
        return total;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
