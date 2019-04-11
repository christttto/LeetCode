class Solution {
    public List<String> commonChars(String[] A) {
        int[] common = new int[26];
        for(char c:A[0].toCharArray()){
            common[c - 'a']++;
        }
        for(int i=1;i<A.length;i++){
            int[] myChars = new int[26];
            for(char c:A[i].toCharArray()){
                myChars[c - 'a']++;
            }
            for(int j=0;j<26;j++){
                if(myChars[j]>common[j]){
                    myChars[j]=common[j];
                }
            }
            common = myChars;
        }
        List commonChars = new ArrayList<String>();
        for(int i=0;i<26;i++){
            for(int j=0; j<common[i];j++){
                commonChars.add(Character.toString((char) ('a' + i)));    
            }
        }
        return commonChars;
    }
}