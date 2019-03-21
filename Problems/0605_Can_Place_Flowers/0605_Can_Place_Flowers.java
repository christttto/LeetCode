class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //iterate on the flowerbed to find the optimal number of plants that can be planted
        //is there a case where it is better to plant in different order
        //for every zero, check if adjacent is also zero.
            //for every case, skip an iteration
        //001
        //check only for the edge
        //
        //rule out length1 case
        if(flowerbed.length==1){
            if(n==0||(flowerbed[0]==0&&n<=1)) return true;
            return false;
        }
        for(int i=0;i<flowerbed.length;i++){//does not take care of edges
            if(i==0&&flowerbed[i+1]==0){//left most edge
                if(--n==0) return true;
                i++;
            }
            else if(i==flowerbed.length-1&&flowerbed[i-1]==0){//right most edge
                if(--n==0) return true;
            }
            else{
                if(flowerbed[i-1]==0&&flowerbed[i+1]==0){
                    if(--n==0) return true;
                    i++;
                }
            }
        }
        return false;
        
    }
}
