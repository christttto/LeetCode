class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int myMax=Integer.MIN_VALUE;
        int total=0;
        for(int i:weights){
            myMax = myMax<i ? i:myMax;
            total+=i;
        }
        while(myMax<total){
            int current=(myMax+total)/2;
            int myD=1;
            int myCapacity=0;
            System.out.println(current);
            for(int i:weights){
                if(myCapacity+i>current){
                    myD++;
                    myCapacity=0;
                }
                myCapacity+=i;
            }
            if(myD>D) myMax=current+1;
            else total=current;
        }
        return myMax;
    }
}