class Solution {
    public List<Integer> partitionLabels(String S) {
        LinkedHashMap<Character,ArrayList<Integer>> letterMap =
            new LinkedHashMap<Character,ArrayList<Integer>>();
        for(int i=0;i<S.length();i++){
            if(!letterMap.containsKey(S.charAt(i))){
                ArrayList<Integer> locations = new ArrayList<Integer>();
                locations.add(i);
                letterMap.put(S.charAt(i),locations);
            }
            else{
                letterMap.get(S.charAt(i)).add(i);
            }
        }
        //lol wrong type
        ArrayList<Integer> rangeList = new ArrayList<Integer>();
        for(Map.Entry<Character,ArrayList<Integer>> entry: letterMap.entrySet()){
            ArrayList range = entry.getValue();
            if(rangeList.isEmpty()){
                rangeList.add(range.get(range.size()-1)-range.get(0)+1);
            }
            else{
                //is the start of this overlapping with any?
                for(int i:rangeList){
                    
                }
            }
        }
    }
}
