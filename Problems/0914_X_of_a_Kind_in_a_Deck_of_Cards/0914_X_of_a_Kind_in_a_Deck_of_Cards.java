class Solution {
    private int gcd(int a, int b) {
       if (b==0) return a;
       return gcd(b,a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<2)return false;
        HashMap<Integer,Integer> cards = new HashMap<Integer,Integer>();
        for(int i:deck){
            if(!cards.containsKey(i)){
                cards.put(i,1);
            }
            else{
                cards.replace(i,cards.get(i)+1);
            }
        }
        Iterator<Integer> iter = cards.values().iterator();
        int myGcd = Integer.MAX_VALUE;
        
        while(iter.hasNext()){
            myGcd = gcd(myGcd,iter.next());
        }
        return (myGcd<=2);
    }
}
