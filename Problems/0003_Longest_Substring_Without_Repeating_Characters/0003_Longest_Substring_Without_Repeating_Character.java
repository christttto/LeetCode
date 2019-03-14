class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set sSet = new HashSet<Character>();
        int answer=0,i=0,j=0;
        while(j<s.length()){
            if(!sSet.contains(s.charAt(j))){//if it is a new character
                sSet.add(s.charAt(j++));
                answer = Math.max(answer,j-i);
            }
            else{//something already seen
                sSet.remove(s.charAt(i++));
            }
        }
        return answer;
    }
}