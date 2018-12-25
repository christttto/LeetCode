/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    var reverse = x.toString().split("").reverse().join("");
    return(reverse==x);
};