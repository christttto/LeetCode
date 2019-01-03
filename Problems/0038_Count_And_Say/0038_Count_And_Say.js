/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    if(n<=1){
        return "1";
    }
    var curStr=n.toString();
    var curNum=curStr.charAt(0);
    var curNumCount=1;
    var i=1;
    while(i<curStr.length){//loop until the end
        if(curNum==curStr.charAt(i)){
            curNumCount++;
            //not count going up
            curStr.splice(i,1);
        }
        
    }
    
};