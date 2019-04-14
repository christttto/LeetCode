class Solution {
    public boolean wordPattern(String pattern, String str) {
        //create stringList
        String[] strList = str.split(" ");
        //if length of pattern != str.length, return false
        if(pattern.length()!=strList.length)return false;
        //make hashmap
        HashMap myMap = new HashMap();
        for(int i=0; i<pattern.length();i++){
            //
            if (myMap.put(pattern.charAt(i), i) != myMap.put(strList[i], i)) return false;
            
        }
        return true;
    }
}