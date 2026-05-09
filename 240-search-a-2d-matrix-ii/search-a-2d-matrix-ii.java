class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Search(matrix, target);
    }

    public static boolean Search(int[][] arr, int x) {
        int r = 0;
        int c = arr[0].length - 1; 

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == x) {
                return true;  
            } else if (arr[r][c] > x) {
                c--;  
            } else {
                r++;  
            }
        }
        return false;
    }
}
