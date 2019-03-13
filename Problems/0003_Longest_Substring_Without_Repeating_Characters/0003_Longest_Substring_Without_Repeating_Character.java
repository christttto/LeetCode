class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set set = new HashSet<Character>();
        int answer=0,i=0,j=0;
        while(i<s.length()&&j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                answer = Math.max(answer,j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return answer;
    }
}