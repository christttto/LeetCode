/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    
    let last_number = digits[digits.length-1];
    let i=digits.length;
    while(i>0){//[9,9,9] [1,0,0,0] 
        if(digits[i-1]==9){
            digits[i-1]=0;
            if(i==1){
                console.log(digits);
                digits.splice(0,0,1);
            }
            i--;
        }
        else{
            digits[i-1]++;
            break;
        }
    }
    return digits
};