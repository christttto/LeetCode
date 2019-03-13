class Solution {
    public boolean isValid(String s) {
        Stack<Character> sStack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                char top = sStack.empty()?'#':sStack.pop();
                if(top!='(')return false;
            }
            else if(c=='}'){
                char top = sStack.empty()?'#':sStack.pop();
                if(top!='{')return false;
            }
            else if(c==']'){
                char top = sStack.empty()?'#':sStack.pop();
                if(top!='[')return false;
            }
            else{
                sStack.push(c);
            }
        }
        return sStack.isEmpty();
    }
}