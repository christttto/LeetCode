class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        ArrayList<int[]> myList = new ArrayList<int[]>(); 
        if(buildings.length==0){return myList;}
        for(int i=0;i<buildings.length;i++){//new conditional
            
            //x0,y is saved
                //if no overlap, add one more. [i-1].x2,0 + [i].x0,[i].y
                //else if [i-1].x0==[i].x0
                    //if 
                //if [i-1].y < [i].y as [i].x0,[i].y
                //else if [i-1].y > [i].y, but as [i-1].x1,[i].y
            if(i==0){
                myList.add(new int[]{buildings[0][0],buildings[0][2]});
            }
            if(buildings[i-1][1]<buildings[i][0]){//no overlap, add two
                myList.add(new int[]{buildings[i-1][1],0});
                myList.add(new int[]{buildings[i][0],buildings[i][2]});
            }
            else if(buildings[i-1][1]==buildings[i][0]){//complete overlap
                
            }
            
        }
        myList.add(new int[]{buildings[buildings.length-1][1],0});
        return myList;
    }
}