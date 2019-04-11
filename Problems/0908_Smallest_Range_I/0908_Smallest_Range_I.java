class Solution {
    public int smallestRangeI(int[] A, int K) {
        if(A.length==1) return 0;
        int myMin = Integer.MAX_VALUE;
        int myMax = Integer.MIN_VALUE;
        for(int i:A){
            if(i>myMax)myMax=i;
            if(i<myMin)myMin=i;
        }
        if((myMax-myMin)<=(K*2))return 0;
        else return ((myMax-myMin)-(K*2));
    }
}