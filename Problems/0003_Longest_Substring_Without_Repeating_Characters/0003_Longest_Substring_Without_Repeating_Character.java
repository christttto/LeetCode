class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set set = new HashSet<Character>();//set up a set
        int longestSubstring=0;
        int i=0,j=0;
        while(i<s.length()&&j<s.length()){//while we iterate on s
            if(!set.contains(s.charAt(j))){//if its a new character
                set.add(s.charAt(j++));//add to the set
                longestSubstring = Math.max(longestSubstring,j-i);//see if best record
            }
            else{//oh no. I saw this before.
                //because we have been checking every single
                //it must be the first one that overlaps
                set.remove(s.charAt(i++));//remove the first character,increment pointer
            }
        }//once we have finished, return
        return longestSubstring;
    }
}