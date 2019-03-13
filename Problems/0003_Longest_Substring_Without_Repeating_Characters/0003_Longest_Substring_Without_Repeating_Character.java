class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring=0;
        for(int i=0;i<s.length()-1;i++){
            Set<Character> mySet = new HashSet<Character>();
            int mySubstring = 1;
            int j=i+1;
            while(j<s.length()){
                if(mySet.contains(s.charAt(j))){
                    break;
                }
                else{
                    mySet.add(s.charAt(j));
                    j++;
                }
            }
            longestSubstring = Math.max(longestSubstring,mySet.size());
        }
        return longestSubstring;
    }
}