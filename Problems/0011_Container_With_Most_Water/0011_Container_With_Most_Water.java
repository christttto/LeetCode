class Solution {
    public int maxArea(int[] height) {
        //naive brute force way would be calculating every permutation
            //Min(a,b)*(ib - ia)
            //better way would be saving only the best
            //time complexity of n^2
            //we can rule out a if the shorter current c is taller.
        //two pointer approach
        int bestVolume=Math.min(height[0],height[1]);
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int myVolume=Math.min(height[i],height[j])*(j-i);
                if(myVolume>bestVolume){
                    bestVolume=myVolume;
                }
            }
        }
        return bestVolume;
    }
}