class Solution {
    public void rotate(int[][] matrix) {
      Rotate(matrix);  
    }
    public static void Rotate(int[][] arr) {
		// Step 1: Transpose
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr[0].length; j++) {
			int temp = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = temp;
		}
	}
		
		// Step 2: Reverse each row
        for(int i = 0; i <arr.length; i++) {
            int left = 0, right = arr.length-1;
            while(left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
