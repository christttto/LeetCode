/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    var currSStart=0;
    var currSFinish=0;
    var finalS="";
    var testS;

    for(var i=0;i<s.length;i++){
        testS=s[i];
        if(!s.substring(currSStart,currSFinish).includes(testS)){
            //if the next is not included in the original
            currSFinish++;
            if(s.substring(currSStart,currSFinish).length>=finalS.length){
                finalS=s.substring(currSStart,currSFinish);
            }
        }
        else{
            var location=s.substring(currSStart,currSFinish).search(testS);
            currSStart = currSStart+location+1;
            currSFinish++;
        }
    }
    //console.log("final answer"+finalS);
    return finalS.length;

    //
};
