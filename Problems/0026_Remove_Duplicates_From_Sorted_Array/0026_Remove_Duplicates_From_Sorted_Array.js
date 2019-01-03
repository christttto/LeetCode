/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    var originalLength=nums.length;
    var i;
    for(i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            nums.splice(i+1,1);
            i=i-1;
        }
    }
    return nums.length;
};