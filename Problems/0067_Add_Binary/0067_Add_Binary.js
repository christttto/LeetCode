/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    //from reverse, keep iterating until one of the input runs out
    let longB
    let shortB
    if(a.length>b.length){
        longB = a
        shortB = b
    }
    else{
        longB = b
        shortB = a
    }
    let i
    let addDigit = false;
    for(i=longB.length-1;i>=0;i--){
        longB.charAt(i)
    }
    
};