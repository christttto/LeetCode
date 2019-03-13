class Solution {
    public boolean isValid(String s) {
        Stack<Character> sStack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                char c=sStack.empty()?'#':sStack.pop();
                if(c!='(') return false;
            }
            else if(s.charAt(i)=='}'){
                char c=sStack.empty()?'#':sStack.pop();
                if(c!='{') return false;
            }
            else if(s.charAt(i)==']'){
                char c=sStack.empty()?'#':sStack.pop();
                if(c!='[') return false;
            }
            else{
                sStack.push(s.charAt(i));
            }
        }
        return sStack.empty();
    }
}