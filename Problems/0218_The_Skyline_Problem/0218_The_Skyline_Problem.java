class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        ArrayList<int[]> myList = new ArrayList<int[]>(); 
        if(buildings.length==0){return myList;}
        for(int i=0;i<buildings.length;i++){
            if(i==0){//if the first, just add the value, everything is in else
                int[] myKey = new int[] {buildings[i][0],buildings[i][2]};
                myList.add(myKey);
            }
            else{
                //if the previous building does not overlap, add that + myKey
                if(buildings[i-1][1]<buildings[i][0]){// no overlap
                    myList.add(new int[]{buildings[i-1][1],0});
                    myList.add(new int[] {buildings[i][0],buildings[i][2]});
                }
                //complete overlap
                else if(buildings[i-1][0]==buildings[i][0]){
                    if(myList.get(myList.size()-1)[1]<buildings[i][2]){
                        System.out.println(buildings[i-1]+" num "+i+" "+buildings[i]);
                        myList.get(myList.size()-1)[1] = buildings[i][2];
                    }
                }
                else{
                    //calculate the coordinate
                    if(buildings[i-1][2]>buildings[i][2]){//if i-1 is taller
                        myList.add(new int[]{buildings[i-1][1],buildings[i][2]});
                    }
                    else if(buildings[i-1][2]<buildings[i][2]){// if i-1 is smaller
                        myList.add(new int[]{buildings[i][0],buildings[i][2]});
                    }
                    else{// i-1 is the same, tricky part
                        
                    }
                }
            }   
        }
        myList.add(new int[]{buildings[buildings.length-1][1],0});
        return myList;
    }
}