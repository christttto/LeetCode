class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        HashMap<String,Integer> myMap=new HashMap<String,Integer>();
        while(0<N){
            int[] myP= new int[cells.length];
            myMap.put(Arrays.toString(cells),N--);
            for(int j=0;j<cells.length;j++){
                if(j==0||j==cells.length-1)myP[j]=0;
                else{
                    if((cells[j-1]==0&&cells[j+1]==0)||
                       (cells[j-1]==1&&cells[j+1]==1))myP[j]=1;
                    else myP[j]=0;
                }
            }
            cells=myP;
            if(myMap.containsKey(Arrays.toString(myP))){
                N%=myMap.get(Arrays.toString(cells))-N;
            }
        }
        return cells;
    }
}