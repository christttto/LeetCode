/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    var originalLength=nums.length;
    var i;
    for(i=0;i<nums.length-1;i++){//loop length-1, so it use the next value
        //if the length was zero, returned this
        //console.log(nums);
        //console.log(nums[i]+"asdf"+nums[i+1]);
        if(nums[i]==nums[i+1]){
            nums.splice(i+1,1);
            i=i-1;
            //console.log(nums+"insideif");
        }
    }
    return nums.length;
};