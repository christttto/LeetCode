class Solution {
    private boolean isMonotone(int N){
        int myN=N;
        while(myN>9){
            int myD = myN%10;
            myD = myD/10;
            if(myN%10<=myD)return false;
        }
        return true;
    }
    public int monotoneIncreasingDigits(int N) {
        if(N<10)return N;
        while(!isMonotone(N)){
            //modify
        }
        return N;
    }
}