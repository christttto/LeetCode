class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> sMap = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.replace(s.charAt(i),0);
            }
            else{
                sMap.put(s.charAt(i),i+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()){
            if(entry.getValue()>0) return entry.getValue()-1;
        }
        return -1;
    }
}
