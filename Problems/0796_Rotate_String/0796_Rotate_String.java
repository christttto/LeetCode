class Solution {
    public boolean rotateString(String A, String B) {
        //find the location of A[0] in B, calculate the offset
            //this will not work if the words in it is unique
        //brute force: rotate by one, compare ever iteration
        //create circular linked list, see if it matches
        //
        if(A.length()==0&&B.length()==0) return true;
        if(A.length()!=B.length())return false;
        for(int i=0;i<A.length();i++){
            //System.out.println(i+" "+A.charAt(i)+B.charAt(0));
            if(A.charAt(i)==B.charAt(0)){
                //System.out.println(A.substring(0,i)+"equals"+B.substring(A.length()-i));
                if(A.substring(i).equals(B.substring(0,A.length()-i))&&
                   A.substring(0,i).equals(B.substring(A.length()-i))
                  ) return true;
            }
        }
        return false;
    }
}