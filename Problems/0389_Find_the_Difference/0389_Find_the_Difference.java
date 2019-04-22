class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> sMap = new HashMap<Character,Integer>();
        Map<Character,Integer> tMap = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),1);
            }
            else{
                sMap.replace(s.charAt(i),sMap.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),1);
            }
            else{
                tMap.replace(t.charAt(i),tMap.get(t.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer> entry: tMap.entrySet()){
            if(!sMap.containsKey(entry.getKey())){
                return entry.getKey();
            }
            if(sMap.get(entry.getKey())<entry.getValue()) return entry.getKey();
        }
        return 'a';
    }
}