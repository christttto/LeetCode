/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    var length = s.length;
    var returnValue = 0;
    var i;
    for(i=0;i<length;i++){
        var curLetter=s.charAt(i);
        var curNumber=0;
        if(curLetter=="I"){
            curNumber = 1;
            if(i+1<length){//one more letters to think about
                if(s.charAt(i+1)=="V"){//next letter is not I, need to subtract
                    curNumber=4;
                    i++;
                }
                else if(s.charAt(i+1)=="X"){
                    curNumber= 9;
                    i++;
                }
            }
        }
        else if(curLetter=="V"){
            curNumber=5;
        }
        else if(curLetter=="X"){
            curNumber = 10;
            if(i+1<length){//one more letters to think about
                if(s.charAt(i+1)=="L"){//next letter is not I, need to subtract
                    curNumber=40;
                    i++;
                }
                else if(s.charAt(i+1)=="C"){
                    curNumber= 90;
                    i++;
                }
            }
        }
        else if(curLetter=="L"){
            curNumber=50;
        }
        else if(curLetter=="C"){
            curNumber = 100;
            if(i+1<length){//one more letters to think about
                if(s.charAt(i+1)=="D"){//next letter is not I, need to subtract
                    curNumber=400;
                    i++;
                }
                else if(s.charAt(i+1)=="M"){
                    curNumber= 900;
                    i++;
                }
            }
        }
        else if(curLetter=="D"){
            curNumber=500;
        }
        else if(curLetter=="M"){
            curNumber=1000;
        }
        returnValue=returnValue+curNumber;
    }
    return returnValue;
};