class Solution {
    public String removeOuterParentheses(String S) {
        if(S.length()==0)return "";
        Stack<Character> sStack = new Stack<Character>();
        StringBuilder sResult = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(sStack.empty()){
                sStack.push(S.charAt(i));
            }
            else{
                if(S.charAt(i)=='('){
                    sStack.push(S.charAt(i));
                    sResult.append(S.charAt(i));
                }
                else{
                    sStack.pop();
                    if(!sStack.empty()) sResult.append(S.charAt(i));
                    
                }
            }
            
        }
        return sResult.toString();
    }
}