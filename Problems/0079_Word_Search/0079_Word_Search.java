class Solution {
    //almost a map search, starting from specific double forloop
    //must know the previous direction
    //set of previous positions. number will be from i*board[0].length+j
    private boolean existHelper(char[][] board, String word, int location, Set visited) {
        //base case where word length==1
        //word==null
        //given position, look at each possible section
        //four directions, can I go each way
        if(word.isEmpty())return true;
        System.out.println(word);
        if(location%board[0].length>0&&board[location/board[0].length][location%board[0].length-1]==word.charAt(0)&&visited.add(location-1)){//left
            System.out.println("left");
            return existHelper(board,word.substring(1),location-1,visited);//next function call
        }
        if(location%board[0].length<board[0].length-1&&board[location/board[0].length][location%board[0].length+1]==word.charAt(0)&&visited.add(location+1)){//right
            System.out.println("right");
            return existHelper(board,word.substring(1),location+1,visited);//next function call
        }
        if(location/board[0].length>0&&board[(location/board[0].length)-1][location%board[0].length]==word.charAt(0)&&visited.add(location-board[0].length)){//up
            System.out.println("up");
            return existHelper(board,word.substring(1),location-board[0].length,visited);//next function call
        }
        if(location/board[0].length<board[0].length-1&&board[(location/board[0].length)+1][location%board[0].length]==word.charAt(0)&&visited.add(location+board[0].length)){//down
            System.out.println("down");
            return existHelper(board,word.substring(1),location+board[0].length,visited); //next function call
        }    
        System.out.println(word);
        return false;
        
    }
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    Set<Integer> mySet = new HashSet<Integer>();
                    if(existHelper(board, word.substring(1), 0, mySet)) return true;
                }
            }
        }
        return false;//not as simple, must get the helper to start at all the possible starts
    }
}
