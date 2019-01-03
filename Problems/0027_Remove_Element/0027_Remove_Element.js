/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    //
    var originalLength=nums.length;
    var i;
    for(i=0;i<nums.length;i++){
        if(nums[i]==val){
            nums.splice(i,1);
            i=i-1;
        }
    }
    return nums.length;
};