/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var isValidHelper = function(s,prevBracket){//helper for previous
        if(s.length>0){
            var curBracket = s.charAt(0);
            console.log(curBracket);
            if(curBracket==")"){
                if(prevBracket!="("){return false;}
                else{return isValidHelper(s.substring(1,s.length-1));}
            }
            else if(curBracket=="}"){
                if(prevBracket!="{"){return false;}
                else{return isValidHelper(s.substring(1,s.length-1));}
            }
            else if(curBracket=="]"){
                if(prevBracket!="["){return false;}
                else{return isValidHelper(s.substring(1,s.length-1));}
            }
            else{
                return isValidHelper(s.substring(1,s.length-1),curBracket);
            }
            
        }
        return true;
        //if s is empty, return nothing
    }
    return isValidHelper(s,"");
};