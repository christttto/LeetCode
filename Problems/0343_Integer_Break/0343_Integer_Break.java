class Solution {
    public int integerBreak(int n) {
        //find the nearest 2^n that is smaller to find n, where n=# division
        //each number will be division of the total number + minimal
        
        int numDivision;
        int total=8;
        for(numDivision=2;n>=total;numDivision++){
            total=(int)Math.pow(2,numDivision+2);
        }
        int numRemain = n%numDivision;
        int startValue = n/numDivision;
        int multiplicationValue=1;
        for(int i=0;i<numDivision;i++){
            if(numRemain>0){
                numRemain--;
                multiplicationValue = multiplicationValue*(startValue+1);
            }
            else{
                multiplicationValue = multiplicationValue*(startValue);    
            }
            
        }
        return multiplicationValue;
        
    }
}