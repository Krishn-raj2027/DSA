class Solution {
    public void setZeroes(int[][] matrix) {
        Zero(matrix);
    }
    public static void Zero(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
         
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        //first pass
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        } 
        //2nd pass
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){

                if(row[i] || col[j]){
                    arr[i][j]=0;
                }
            }
        }
    }
}