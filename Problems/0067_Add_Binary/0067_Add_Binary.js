/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    //from reverse, keep iterating until one of the input runs out
    /*
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
    let i=shortB.length-1
    let j
    let addDigit = false
    for(i=longB.length-1.length-1;i>=0;i--){
        if(addDigit){
            if(longB[i]==1&&shortB[j]==1)
        }
    }
    */
    console.log(parseInt(a,2))
    console.log(parseInt(b,2))
    let intTotal=parseInt(a,2)+parseInt(b,2)
    console.log(intTotal)
    
    return intTotal.toString(2)
    
    
    
};