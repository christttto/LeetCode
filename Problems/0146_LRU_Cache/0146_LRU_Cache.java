class LRUCache {
    LinkedHashMap<Integer,Integer> myMap;
    int myCapacity;
    public LRUCache(int capacity) {
        myCapacity = capacity;
        myMap = new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>myCapacity;
            }
        };
    }
    
    public int get(int key) {
        return myMap.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        myMap.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */