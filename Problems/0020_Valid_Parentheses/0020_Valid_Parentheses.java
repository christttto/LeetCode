class Solution {
    public boolean isValid(String s) {
        Deque sStack = new ArrayDeque();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(sStack.poll().toString()!="(") return false;
                //System.out.println(sStack.)
            }
            else if(s.charAt(i)=='}'){
            if(sStack.poll().toString()!="{") return false;
            }
            else if(s.charAt(i)==']'){
                if(sStack.poll().toString()!="[") return false;
            }
            else{
                sStack.push(s.charAt(i));
            }
        }
        return sStack.isEmpty();
    }
}