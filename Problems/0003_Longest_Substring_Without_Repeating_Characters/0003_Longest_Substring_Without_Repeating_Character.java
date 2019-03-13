class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set set = new HashSet<Character>();
        int longestSubstring=0;
        int i=0,j=0;
        while(i<s.length()&&j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                longestSubstring = Math.max(longestSubstring,j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return longestSubstring;
    }
}