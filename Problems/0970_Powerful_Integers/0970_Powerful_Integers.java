class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> outputSet = new HashSet<Integer>();
        for(int i=0;Math.pow(x,i)<=bound;i++){
            for(int j=0;Math.pow(x,i)+Math.pow(y,j)<=bound;j++){
                outputSet.add((int)(Math.pow(x,i)+Math.pow(y,j)));
                if(y==1)break;
            }
            if(x==1)break;
        }
        return outputSet.stream().collect(Collectors.toList());
    }
}