class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> myS=new HashSet<Integer>();
        int firstTotal=0;
        int secondTotal=0;
        for(int i:nums){
            if(myS.contains(i))firstTotal+=i;
            else {
                myS.add(i);
                secondTotal+=i;
            }
        }
        return secondTotal-(firstTotal/2);
    }
}