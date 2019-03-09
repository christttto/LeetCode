class Solution {
    public boolean isPalindrome(String s) {
        //collect only the characters
        //cut half
        //see if a reverse of the back string is equal to the front
        //s.clean
        //string front = s.firsthalf
        //string back = s.secondhalf.reverse
        //compare
        
        //so it took longer than I expected, because of 0P, which was not OP.
        //the 
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String front;
        String back;
        
        front = s.substring(0,s.length()/2);
        if(s.length()%2==1){
            back = new StringBuilder(s.substring((s.length()/2)+1)).reverse().toString();
        }
        else{
            back = new StringBuilder(s.substring((s.length()/2))).reverse().toString();
        }
        return front.equalsIgnoreCase(back);
        
    }
}