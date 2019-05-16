class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows<1)return new ArrayList<List<Integer>>();
        //if numRows==1
        List<List<Integer>> rowList = new ArrayList<List<Integer>>();
        List<Integer> startList = new ArrayList<Integer>();
        startList.add(1);
        rowList.add(startList);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = rowList.get(rowList.size()-1);
            ArrayList newRow = new ArrayList<Integer>();
            newRow.add(1);
            for(int j=0;j<prevRow.size()-1;j++){
                newRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            newRow.add(1);
            rowList.add(newRow);
        }
        return rowList;
    }
}