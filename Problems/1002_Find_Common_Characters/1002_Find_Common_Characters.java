class Solution {
    public List<String> commonChars(String[] A) {
        Map commonChars = new HashMap<char>();
        for(char c:A[0]){
            if(commonChars.contains(c)){
                commonChars.replace(c,commonChars.get(c)++);
            }
            else{
                commonChars.put(c,1);
            }
        }
        for(String word: A){
            Map myChars = new HashMap<char>();
            for(char c:word){
                if(myChars.contains(c)){
                    myChars.replace(c,myChars.get(c)++);
                }
                else{
                    myChars.put(c,1);
                }
            }
            for(char c:commonChars.keySet()){//cross checking
                if(myChars.containsKey(c)){
                    if(myChars.get(c)>commonChars.get(c)){
                        myChars.replace(c,commonChars.get(c));
                    }
                }
            }
        }
        
    }
}
