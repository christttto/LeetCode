class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //make hashkey
        HashMap<Integer,Integer> numFrequency = new HashMap();
        for(int i:nums){
            numFrequency.put(i,numFrequency.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> numQueue = 
            new PriorityQueue<Integer>((n1,n2)->numFrequency.get(n1)-numFrequency.get(n2));
        for(int i:numFrequency.keySet()){
            numQueue.add(i);
            if(numQueue.size()>k){
                numQueue.poll();
            }
        }
        List<Integer> finalist = new LinkedList();
        while(!numQueue.isEmpty()){
            finalist.add(numQueue.poll());
        }
        Collections.reverse(finalist);
        return finalist;
    }
}