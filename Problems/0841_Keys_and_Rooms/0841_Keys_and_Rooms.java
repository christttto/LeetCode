class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> keyQ = new LinkedList<Integer>();
        Set<Integer> keySet = new HashSet<Integer>();
        keySet.add(0);
        for(int i=0;i<rooms.get(0).size();i++){
            System.out.println("firstkey"+rooms.get(0).get(i));
            keyQ.add(rooms.get(0).get(i));
            keySet.add(rooms.get(0).get(i));
        }
        while(!keyQ.isEmpty()){
            int visitingRoom = keyQ.remove();
            for(int i=0;i<rooms.get(visitingRoom).size();i++){
                System.out.println("room im in"+rooms.get(visitingRoom));
                if(keySet.add(rooms.get(visitingRoom).get(i))){
                    System.out.println(rooms.get(visitingRoom).get(i));
                    keyQ.add(rooms.get(visitingRoom).get(i));
                }
            }
        }
        for(int i=0;i<rooms.size();i++){
            System.out.println("checking"+i);
            if(!keySet.contains(i)) return false;
        }
        return true;
    }
}
