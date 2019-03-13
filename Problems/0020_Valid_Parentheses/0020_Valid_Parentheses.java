class Solution {
    public boolean isValid(String s) {
        Stack<Character> sStack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char myC = s.charAt(i);
            if(myC==')'){
                char c=sStack.empty()?'#':sStack.pop();
                if(c!='(')return false;
            }
            else if(myC=='}'){
                char c=sStack.empty()?'#':sStack.pop();
                if(c!='{')return false;
            }
            else if(myC==']'){
                char c=sStack.empty()?'#':sStack.pop();
                if(c!='[')return false;
            }
            else{
                sStack.push(myC);
            }
        }
        return sStack.empty();
    }
}