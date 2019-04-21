class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> sHashMap = new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(sHashMap.containsKey(s.charAt(i))){
                if(sHashMap.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                if(sHashMap.containsValue(t.charAt(i))) return false;
                sHashMap.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
