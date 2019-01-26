/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s=s.trim();
    let count=0;
    let i;
    console.log(s);
    for(i=s.length-1;0<=i;i--){
        if(s[i]!=" "){
            count=count+1;
        }
        else{
            break;
        }
        
    }
    return count;
};