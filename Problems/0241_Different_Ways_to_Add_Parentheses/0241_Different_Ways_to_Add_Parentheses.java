class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        //three seperate calls 
        //when iteration on input is done, add to set
        //return the set in List
        List<Integer> results = new LinkedList<Integer>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='-'||
               input.charAt(i)=='+'||
               input.charAt(i)=='*'){
                String part1 = input.substring(0,i);
                String part2=input.substring(i+1);
                List<Integer> part1Result=diffWaysToCompute(part1);
                List<Integer> part2Result=diffWaysToCompute(part2);
                for(int p1:part1Result){
                    for(int p2:part2Result){
                        int j=0;
                        if(input.charAt(i)=='+')j=p1+p2;
                        else if(input.charAt(i)=='-')j=p1-p2;
                        else j=p1*p2;
                        results.add(j);
                    }
                }
            }
        }
        if(results.size()==0)results.add(Integer.valueOf(input));
        return results;
    }
}