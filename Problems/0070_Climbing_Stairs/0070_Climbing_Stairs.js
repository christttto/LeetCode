/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    switch(n){
        case 0: return 0
        case 1: return 1
        case 2: return 2
    }
    let i = 0
    let j = 1
    let k = 2
    for(i=0;i<n-2;i++){
        j+=k
        let l=k
        k=j
        j=l
    }
    return k
};