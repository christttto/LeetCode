class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
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
