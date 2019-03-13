class Solution {
    public int maxArea(int[] height){
        int maxArea=0,a=0,b=height.length-1;
        while(a<b){
            maxArea=Math.max(maxArea,Math.min(height[a],height[b])*(b-a));
            if(height[a]<height[b]) a++;
            else b--;
        }
        return maxArea;
    }
}