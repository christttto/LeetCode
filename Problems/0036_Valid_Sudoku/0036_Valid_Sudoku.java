class Solution {
    public boolean isValidSudoku(char[][] board) {
        //for each number, check if three rule works (n^3)
        //for each rule check any wrong (n*3)
        //each row 
        //each column
        //each grid
        
        System.out.println("check row");
        for(char[] row:board){
            //use set to see if includes
            Set<Character> mySet = new HashSet<Character>();
            for(char number: row){
                //System.out.println("check"+number);
                if(mySet.contains(number)&&number!='.') return false;
                mySet.add(number);
            }
        }
        
        System.out.println("check column");
        for(int i=0;i<board[0].length;i++){
            Set<Character> mySet = new HashSet<Character>();
            for(int j=0; j<board.length;j++){
                //System.out.println("check"+board[j][i]);
                if(mySet.contains(board[j][i])&&board[j][i]!='.') return false;
                mySet.add(board[j][i]);
            }
        }
        
        System.out.println("check grid");
        for(int i=0;i<board[0].length;i+=3){
            for(int j=0; j<board.length;j+=3){
                Set<Character> mySet = new HashSet<Character>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        //System.out.println("check"+board[k][l]);
                        if(mySet.contains(board[k][l])&&board[k][l]!='.') return false;
                        mySet.add(board[k][l]);
                    }
                }
            }
        }
        return true;
    }
}
