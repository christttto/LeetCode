class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
//         int row=matrix[0].length;
//         int col=matrix.length;
//         //grab the full length ones first
//         int numLong=Math.abs(row-col)+1;
//         if(row<col){//vertically longer
//             System.out.println("vertically longer");
//             for(int i=0;i<numLong;i++){// i is starting location changing row
//                 int myN=matrix[i][0];
//                 for(int j=i;j<row*col;j+=row+1){//go diagonally
//                     System.out.println(j+" "+matrix[j/row][j%row]);
//                     if(matrix[j/row][j%row]!=myN) return false;
//                 }
//             }
//             for(int i=0;numLong+i<col;i++){//left corner
//                 for(int j=0;j<i-1;j++){
                    
//                 }
//             }
//         }
//         else{//horizontally longer or square
//             System.out.println("horizontally longer");
//             for(int i=0;i<numLong;i++){// i is starting location column
//                 int myN=matrix[0][i];
//                 for(int j=i;j<row*col;j+=row+1){//go diagonally
//                     System.out.println(j+" "+matrix[j/row][j%row]);
//                     if(matrix[j/row][j%row]!=myN) return false;
//                 }
//             }
//         }
//         //take care of the side ones
//         //starting from math.min(row,col)-1
//         for(int i=0;(math.min(row,col)-1)-i>0;i++){
            
//         }
        int width=matrix[0].length;
        int height=matrix.length;
        int[] template = new int[width-1];
        for(int i=0;i<template.length;i++) template[i]=matrix[0][i];
        for(int i=1;i<height;i++){
            for(int j=1;j<width;j++){
                if(matrix[i][j]!=template[j-1])return false;
                template[j-1]=matrix[i][j-1];
            }
        }
        return true;
    }
}
