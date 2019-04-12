class Solution {
    public boolean isHappy(int n) {
        //make a set, loop to add digits while saving final values
        //if the final value ==1, return true
        HashSet<Integer> valueSet = new HashSet<Integer>();
        while(n!=1){
            int value=0;
            while(n>0){
                value+=Math.pow(n%10,2);
                n=n/10;
            }
            System.out.println(value);
            if(!valueSet.add(value)) return false;
            n=value;    

            
        }
        return true;
    }
}
