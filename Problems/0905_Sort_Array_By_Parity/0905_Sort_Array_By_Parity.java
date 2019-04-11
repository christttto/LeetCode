class Solution {
    public int[] sortArrayByParity(int[] A) {
        for(int i=0,j=-1;i<A.length;i++){//i will be for increment
            if(A[i]%2==1&&j==-1){//first odd after even
                j=i;
                
            }
            else{
                if(A[i]%2==0&&j!=-1){
                    int t= A[j];
                    A[j]=A[i];
                    A[i]=t;
                    j++;
                }
            }
        }
        return A;
    }
}