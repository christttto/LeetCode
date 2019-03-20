class Solution {
    public void rotate(int[][] matrix) {
        //flip xy
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                //swap matrix[i][j] with matrix[j][i]
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j]-matrix[j][i];
                matrix[i][j] = matrix[i][j]-matrix[j][i];
            }
            for(int j=0;j<matrix[0].length/2;j++){
                matrix[i][j] += matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = matrix[i][j]-matrix[i][matrix[0].length-1-j];
                matrix[i][j] = matrix[i][j]-matrix[i][matrix[0].length-1-j];                
            }
        }
    }
}
