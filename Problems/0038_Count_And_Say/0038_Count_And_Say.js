/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    if(n<=1){
        return "1";
    }
    var i;
    var curStr="1";
    for(i=0;i<n;i++){//loops for n times
        var curLen=curStr.length;
        for(j=0;j<curLen-1;j++){//looping on individual n
            var countRe=1;
            var curChar=curStr[j];
            while(curStr[j+1]==curChar){
                countRe++;
                //remove curStr[j+1] from string
                curStr.
            }
        }
    }
    
};