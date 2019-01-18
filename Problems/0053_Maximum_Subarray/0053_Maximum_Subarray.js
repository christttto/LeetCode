/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    var max=nums[0];
    var i;
    for(i=0;i<nums.length;i++){
        var k;
        var total=0;
        console.log("secondloop");
        for(k=i;k<nums.length;k++){
            total= total+nums[k];
            if(total>max){
                max=total;
            }
        }
    }
    return max;
};