/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    var currSStart=0;
    var currSFinish=0;
    var currS=s.substring(currSStart,currSFinish);
    var testS;

    for(var i=0;i<s.length;i++){
        testS=s[i];
        if(!currS.includes(testS)){//if the next is not included in the original
            currSFinish++;
            currS=s.substring(currSStart,currSFinish);
            console.log(currS);
        }
        else{//so if it is in there, cut to the overlap,

        }
    }
    return currS.length;

    //
};
