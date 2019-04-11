class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length<=2) return true;
        boolean firstTime=true;
        boolean increasing=false;
        for(int i=1;i<A.length;i++){
            if(A[i-1]>A[i]){//decreasing
                if(firstTime) firstTime=false;
                else if(increasing) return false;
            }
            else if(A[i-1]<A[i]){//increasing
                if(firstTime){
                    firstTime=false;
                    increasing=true;
                }
                else if(!increasing)return false;
            }
        }
        return true;
    }
}
