class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        for(int i=1;i<grid[0].length-1;i++){
            for(int j=1;j<grid.length-1;j++){
                if(grid[j][i]!=5) break;
                if(grid[j-1][i-1]+grid[j+1][i+1]!=10) break;
                if(grid[j-1][i]+grid[j+1][i]!=10) break;
                if(grid[j-1][i+1]+grid[j+1][i-1]!=10) break;
                if(grid[j-1][i-1]+grid[j-1][i]+grid[j-1][i+1]!=15) break;
                if(grid[j][i-1]+grid[j][i]+grid[j][i+1]!=15) break;
                if(grid[j+1][i-1]+grid[j+1][i]+grid[j+1][i+1]!=15) break;
                if(grid[j-1][i-1]+grid[j][i-1]+grid[j+1][i-1]!=15) break;
                if(grid[j-1][i]+grid[j][i]+grid[j+1][i]!=15) break;
                if(grid[j-1][i+1]+grid[j][i+1]+grid[j+1][i+1]!=15) break;
                count++;
            }
        }
        return count;
    }
}
