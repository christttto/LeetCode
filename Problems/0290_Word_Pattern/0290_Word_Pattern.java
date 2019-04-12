class Solution {
    public boolean wordPattern(String pattern, String str) {
        //make hashmap of str's char and relevent pattern
        HashMap<Character,String> myPattern = new HashMap<Character,String>();
        String[] strArray = str.split(" ");
        char[] patternArray = pattern.toCharArray();
        if(strArray.length!=patternArray.length)return false;
        for(int i=0;i<strArray.length;i++){
            if(myPattern.containsKey(patternArray[i])){
                System.out.println(myPattern.get(patternArray[i])!=strArray[i]);
                if(myPattern.get(patternArray[i])!=strArray[i]) return false;
            }
            else{
                myPattern.put(patternArray[i],strArray[i]);
            }
        }
        return true;
    }
}