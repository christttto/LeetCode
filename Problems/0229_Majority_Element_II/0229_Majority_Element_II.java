class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //based on length, calculate the min n required to be more than n/3.
        //create hashmap to know what goes over
        //the moment we have two candidates, no need to keep on calculating
        if(nums.length==0)return new ArrayList<Integer>();
        HashMap<Integer,Integer> myNums = new HashMap<Integer,Integer>();
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int min = nums.length/3;
        for(int i:nums){
            if(myNums.containsKey(i)){
                myNums.replace(i,myNums.get(i)+1);
            }
            else{
                myNums.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> Entry: myNums.entrySet()){
            if(Entry.getValue()>min) myList.add(Entry.getKey());
        }
        return myList;
    }
}