class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length<2)return true;
        int increase=0;
        int prev=A[0];
        for(int i=1;i<A.length;i++){
            if(prev!=A[i]){//skip same number to previous
                if(prev<A[i]){
                    if(increase==0){
                        increase=1;
                    }
                    else if(increase==2) return false;
                }
                else if(prev>A[i]){
                    if(increase==0){
                        increase=2;
                    }
                    else if(increase==1) return false;
                }
            }
            prev=A[i];
        }
        return true;
    }
}