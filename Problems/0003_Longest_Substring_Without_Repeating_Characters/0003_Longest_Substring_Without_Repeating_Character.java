class Solution {
    private int findSubString(LinkedList s){
        char myStart = s.get(0);
        int count=1;
        while(s.hasNext){
            if(myStart==s.poll()) return count;
            count++;
            s=s.next();
        }
        return count;
    }
    public int lengthOfLongestSubstring(String s) {
        //make linked list of s
        //iterate while calling new function
        List sLinkedList = new LinkedList();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            sLinkedList.add(s.charAt(i));
        }
        int longest=0;
        for(LinkedList l: sLinkedList){
            if(findSubString(l)>longest) longest=findSubString(l);
        }
        return longest;
    }
}