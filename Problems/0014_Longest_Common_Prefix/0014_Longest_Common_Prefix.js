/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    //if strs is empty, need to cover that
    if(strs.length==0){
        return "";
    }
    var prefix=strs[0];//default
    var i;
    for(i=1;i<strs.length;i++){
        var curWord=strs[i];
        var j;
        if(curWord.length<prefix.length){
            console.log("prefix: "+prefix+" curWord:"+curWord);
            prefix = prefix.substring(0,curWord.length);
        }
        for(j=0;j<curWord.length;j++){
            if(!(curWord.charAt(j)==prefix.charAt(j))){
                prefix = prefix.substring(0,j);
            }
        }
    }
    return prefix;
};