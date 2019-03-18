class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        ArrayList<int[]> myList = new ArrayList<int[]>(); 
        if(buildings.length==0){return myList;}
        for(int i=0;i<buildings.length;i++){//new conditional
            
        }
        myList.add(new int[]{buildings[buildings.length-1][1],0});
        return myList;
    }
}