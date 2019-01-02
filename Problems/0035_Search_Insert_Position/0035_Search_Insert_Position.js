/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    /*
    if(nums.indexOf(target)!=-1){
        return nums.indexOf(target);
    }
    */
    if(nums.length==0){//empty
        return 0;
    }
    else if(nums[0]==target){//found it
        return 0;
    }
    else if(nums[Math.floor(nums.length/2)]==target){//half and target is smaller
        return Math.floor(nums.length/2);
    }
    else if(nums[Math.floor(nums.length/2)]>target){//half and target is smaller
        return searchInsert(nums.slice(0,nums.length/2),target);
    }
    else if(nums[Math.floor(nums.length/2)]<target){//half and target is bigger
        return (1+Math.floor(nums.length/2))+searchInsert(nums.slice((nums.length/2)+1,nums.length),target);
    }
    console.log(nums.length/2);
    console.log(nums[nums.length/2]+"adf"+target);
    
    
};