/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    var max=nums[0];
    var i;
    for(i=0;i<nums.length;i++){
        console.log(i<nums.length);
        console.log("=====")
        var k=i;
        var total=0;
        console.log(k);
        console.log(nums.length);
        console.log(k<nums.length);
        console.log("secondloop");
        for(k=i;k<nums.lenth;k++){
            console.log("sanity check");
            total= total+nums[k];
            if(total>max){
                max=total;
            }
        }
    }
    return max;
};