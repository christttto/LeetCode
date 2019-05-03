class Solution {
    private void helper(String digits, char[] letters,int i, ArrayList myL){
        if(i==digits.length()){
            myL.add(String.valueOf(letters));
        }
        else{
            if(digits.charAt(i)=='2'){
                letters[i]='a';
                helper(digits,letters,i+1,myL);
                letters[i]='b';
                helper(digits,letters,i+1,myL);
                letters[i]='c';
                helper(digits,letters,i+1,myL);
            }
            else if(digits.charAt(i)=='3'){
                letters[i]='d';
                helper(digits,letters,i+1,myL);
                letters[i]='e';
                helper(digits,letters,i+1,myL);
                letters[i]='f';
                helper(digits,letters,i+1,myL);
            }
            else if(digits.charAt(i)=='4'){
                letters[i]='g';
                helper(digits,letters,i+1,myL);
                letters[i]='h';
                helper(digits,letters,i+1,myL);
                letters[i]='i';
                helper(digits,letters,i+1,myL);
            }
            else if(digits.charAt(i)=='5'){
                letters[i]='j';
                helper(digits,letters,i+1,myL);
                letters[i]='k';
                helper(digits,letters,i+1,myL);
                letters[i]='l';
                helper(digits,letters,i+1,myL);
            }
            else if(digits.charAt(i)=='6'){
                letters[i]='m';
                helper(digits,letters,i+1,myL);
                letters[i]='n';
                helper(digits,letters,i+1,myL);
                letters[i]='o';
                helper(digits,letters,i+1,myL);
            }
            else if(digits.charAt(i)=='7'){
                letters[i]='p';
                helper(digits,letters,i+1,myL);
                letters[i]='q';
                helper(digits,letters,i+1,myL);
                letters[i]='r';
                helper(digits,letters,i+1,myL);
                letters[i]='s';
                helper(digits,letters,i+1,myL);
            }
            else if(digits.charAt(i)=='8'){
                letters[i]='t';
                helper(digits,letters,i+1,myL);
                letters[i]='u';
                helper(digits,letters,i+1,myL);
                letters[i]='v';
                helper(digits,letters,i+1,myL);
            }
            else{
                letters[i]='w';
                helper(digits,letters,i+1,myL);
                letters[i]='x';
                helper(digits,letters,i+1,myL);
                letters[i]='y';
                helper(digits,letters,i+1,myL);
                letters[i]='z';
                helper(digits,letters,i+1,myL);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<String>();
        char[] letters=new char[digits.length()];
        ArrayList<String> myL=new ArrayList<String>();
        helper(digits,letters,0,myL);
        return myL;
    }
}