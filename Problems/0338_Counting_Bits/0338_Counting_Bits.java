class Solution {
    public int[] countBits(int num) {
        int[] returnList = new int[num+1];
        returnList[0]=0;
        //2 pointers
        //needs breakpoint to know when it should be taken back to start
        int addDigit = 1;
        for(int i=1,c=0;i<=num;i++,c++){
            if(c==addDigit){
                addDigit*=2;
                c=0;
            }
            returnList[i]=returnList[c]+1;
        }
        return returnList;
    }
}