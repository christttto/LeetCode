/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    //understand 32-bit signed integer, reverse digits of an integer
    //wait no need not really
    var result = 0;
    var i = 1;
    var mySign = Math.sign(x);
    x = x * mySign;
    while(x>0){
        result = (result*10)+(x%10)*i;
        x = parseInt(x/10);
    }
    return result*mySign;

};