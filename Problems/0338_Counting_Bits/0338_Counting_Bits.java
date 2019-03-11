class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];//make a list of integer with right length
        ret[0] = 0;//set the base case
        int pow = 1;//how much it should be powered by
        for(int i = 1, t = 0; i <= num; i++, t++) { //set up the iterator. t is for?
            if(i == pow) { //
                pow *= 2; // everytime it reaches the double point, reset and make the range double.
                t = 0;
            }
            // going normal pace = at t + 1
            ret[i] = ret[t] + 1;
        }
        return ret;
    }
}

class Solution{
    public int[] countBits(int num){
        int[] returnList = new int[num+1];
        returnList[0]=0;
        int addDigit = 1;
        for(int i=1,int t=0;i<=num;i++,t++){
            if(i==addDigit){
                addDigit *=2;
                t=0;
            }
            returnList[i]=returnList[t]+1;
        }
        return returnList;
    }
}