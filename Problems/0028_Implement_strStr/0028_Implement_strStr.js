/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    //loops that start with less number of character left than needle is unnecessary
    return haystack.search(needle);
};