class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
    //create hashmap for domain and num of visits
    Map<String,Integer> myMap = new HashMap<String,Integer>();
    //iterate on each item in cpdomains
    for(int i=0;i<cpdomains.length;i++){
        int visitCount = cpdomains[i].split()[0];
        String cpdomain = cpdomains[i].split()[1];
        while(cpdomain.length>0){
            if(!myMap.add(cpdomain,visitCount)){
                //edit the value
            }
            //update cpdomain to shorter
        }
    }
    
    
    //split the item by space for numOfVisits, domain
    //if already included in the hash, add the num of visits
    //else make a new one with value of visits
    //return list
    }
}
