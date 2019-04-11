class Solution {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for(int n:A){
            if(n%2==0){
                evenList.add(n);
            }
            else{
                oddList.add(n);
            }
        }
        evenList.addAll(oddList);
        return evenList.stream().mapToInt(i -> i).toArray();
    }
}