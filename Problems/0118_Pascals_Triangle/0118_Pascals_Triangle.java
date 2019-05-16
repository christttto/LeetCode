class Solution {
    public List<List<Integer>> generate(int numRows) {
        // if(numRows==0){ return null;}
        // if(numRows==1){
        //     return List();
        // }
        List returnList = new ArrayList();
        for(int j=0;j<numRows;j++){
            List<Integer> myList = new ArrayList<>();
            myList.add(1);
            for(int k =0; k<j;k++){
                myList.add(myList.get(k)*(j-k)/(k+1));
            }
            returnList.add(myList);
        }
        return returnList;
    }
}